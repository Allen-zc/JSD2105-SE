package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

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

            System.out.println("等待客户端连接。。。");

            Socket socket = serverSocket.accept();

            System.out.println("一个客户端已连接！");

            InputStream in = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            BufferedReader br = new BufferedReader(isr);

            while (true){

                //读取客户端发送过来的一行字符串
                String line = br.readLine();

                String regex = "(wqnmlgb|nmb|cnm|nc|djb|dsb|wrsndm|nmsl|你个|狗东西|日|我去你妈了个逼|尼玛|草尼玛|你妈逼|操你妈|脑残|大鸡巴|我日死你的妈|你妈死了|草泥马|大傻逼|傻逼|小人贱人|坏人|坏蛋|王八蛋|狼心狗肺|狗仗人势|禽兽不如|狼狈为奸|衣冠禽兽|猪狗不如|忘恩负义|为虎作伥|恩将仇报|指鹿为马|贼眉鼠眼|粉墨登场|鼠目寸光|祸国殃民|卑鄙无耻|丧心病狂|丧尽天良|狼心狗肺|吃里扒外|心怀叵测|井底之蛙|厚颜无耻|小肚鸡肠)";

                String lines = line.replaceAll(regex, "我爱你");


                System.out.println("客户端说：" + lines);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

}
