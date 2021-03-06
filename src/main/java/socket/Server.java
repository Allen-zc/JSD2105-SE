package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

/**
 * 聊天室服务端
 */

public class Server {

    /**
     * ServerSocket是运行在服务端的，主要有两个作用：
     * 1.向系统申请服务端口，客户端就是i通过这个端口与服务端建立连接
     * 2.监听服务端口，一旦一个客户端连接了就会立即返回一个Socket，
     * 通过这个Socket与客户端对等交互。
     *
     * 如果我们将Socket比喻为“电话”，那么ServerSocket相当于是“总机”。
     */

    private ServerSocket serverSocket;

    /**
     * 存放所有客户端输出流,便于广播消息使用
     */
//    private PrintWriter[] allOut ={};
//    private Collection<PrintWriter> allOut = new ArrayList<>();

    //并发安全的集合
    private List<PrintWriter> allOut = Collections.synchronizedList(new ArrayList<>());



    public Server(){
        try {

            /**
             * 实例化ServerSocket的同时指定服务端口，客户端就是通过这个端口与服务端建立连接的，
             * 该端口不能与当前系统其他应用程序申请的端口一致，否则会抛出异常：
             * java.net.BindException:address already in use
             */

            System.out.println("正在启动服务端。。。");

            serverSocket = new ServerSocket(8088);

            System.out.println("服务端启动完毕！");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){

        try {

            /**
             * serverSocket提供的方法：
             * Socket accept()
             * 该方法是一个阻塞方法，调用后程序“卡住”，开始等待客户端的链接，
             * 一旦一个客户端建立连接，此时该方法会立即返回一个Socket，
             * 通过这个Socket就可以与该客户端交互了。
             * 相当于是“接电话”操作。
             */


            while (true){
                System.out.println("等待客户端连接中。。。");
//                System.out.println("接听中...");

                Socket socket = serverSocket.accept();

                System.out.println("新的客户端连接成功！");

                //启动一个线程来处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                System.out.println(handler.host + "进入房间!");
                Thread thread = new Thread(handler);

                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务是负责并发处理某个客户端的交互工作
     */
    public class ClientHandler implements Runnable{
        private Socket socket;
        private String host;    //记录客户端IP地址信息

        public ClientHandler(Socket socket){
            this.socket =socket;
            //通过socket获取远端计算机（客户端）的地址信息
            host = socket.getInetAddress().getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in,"UTF-8");
                BufferedReader br = new BufferedReader(isr);

                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);


                /**
                 * 选取锁对象的原则：多个线程看到的锁多项必须是同一个。
                 * 通常我们可以指定临界资源作为锁对象。
                 *
                 * 但是这里多个线程抢的临界资源是allOut，这里不行的原因是：
                 * 同步块中的操作包含对数组的扩容，而扩容会导致allOut指向
                 * 别的对象，那么就等于说锁对象一直在发生改变。
                 */

               /*
                synchronized (ClientHandler.class){
//                   //将该输出流存入共享数组allOut中
//                   //1扩容allOut
//                   allOut = Arrays.copyOf(allOut,allOut.length+1);
//                   //2将输出流存入数组最后一个位置
//                   allOut[allOut.length-1] = pw;

                    allOut.add(pw);
               }
               */

                //并发安全的集合多线程add时会同步操作
                allOut.add(pw);

//                sendMessage(host + "上线了，当前在线人数：" + allOut.length);
                sendMessage(host + "上线了,当前在线人数:" + allOut.size());

                String line;

                /**
                 * 当客户断开连接时，由于断开的方式不同，这里体现的也不同，
                 * 当客户端强行停止客户端程序（导致socket.close方法没有调用）
                 * 那么服务端这里的readline方法会抛出异常。
                 * 如果客户端正常停止程序（输入exit停止，则会调用socket.close方法）
                 * 那么resdline方法会返回null表示读取到了末尾，自然停止读取操作。
                 */

                while ((line = br.readLine())!= null){

                    //读取客户端发送过来的一行字符串

                    String regex = "(wqnmlgb|nmb|cnm|nc|djb|dsb|wrsndm|nmsl|狗东西|日|我去你妈了个逼|尼玛|草尼玛|你妈逼|操你妈|脑残|大鸡巴|我日死你的妈|你妈死了|草泥马|大傻逼|傻逼|小人贱人|坏人|坏蛋|王八蛋|狼心狗肺|狗仗人势|禽兽不如|狼狈为奸|衣冠禽兽|猪狗不如|忘恩负义|为虎作伥|恩将仇报|指鹿为马|贼眉鼠眼|粉墨登场|鼠目寸光|祸国殃民|卑鄙无耻|丧心病狂|丧尽天良|吃里扒外|心怀叵测|井底之蛙|厚颜无耻|小肚鸡肠)";

                    String lines = line.replaceAll(regex, "***");


                    System.out.println(host + "说：" + lines);
                    //将消息恢复给所有客户端
                    sendMessage(host + "说" + lines);

                }
            }catch (IOException e){
            }finally {
                //处理客户端断开连接后的操作
                //将当前客户端的输出流从数组allOut中删除
                /*
                synchronized (ClientHandler.class){
//                    for (int i = 0; i < allOut.length; i++) {
//                        if (allOut[i] == pw){
//                            allOut[i] = allOut[allOut.length-1];
//                            allOut = Arrays.copyOf(allOut,allOut.length-1);
//                            break;
//                        }
//                    }
                    for (Object newallOut : allOut) {
                        if (newallOut == pw){
                            allOut.remove(pw);
                            break;
                        }
                    }
                }
                */

                allOut.remove(pw);

//                System.out.println(host + "下线了，当前在线人数：" + allOut.length);
//                sendMessage(host + "下线了，当前在线人数：" + allOut.length);
                System.out.println(host + "下线了,当前在线人数:" + allOut.size());
                sendMessage(host + "下线了,当前在线人数:" + allOut.size());

                try {
                    socket.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * 将消息发送给所有客户端
     */
    public void sendMessage(String message){

        /*
        synchronized (ClientHandler.class){
//            for (int i = 0; i < allOut.length; i++) {
//                allOut[i].println(message);
//            }
            for (PrintWriter newallOut : allOut) {
                newallOut.println(message);
            }
        }
         */

        allOut.forEach(pw-> pw.println(message));
    }

}
