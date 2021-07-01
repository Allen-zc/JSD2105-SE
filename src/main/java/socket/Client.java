package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 */

public class Client {

    /**
     * java.net.Socket  套接字
     * Socket封装了TCP协议的通讯细节，使用它可以与远端计算机建立连接并使用
     * 两个流（一个输入，一个输出）完成与远端计算机的数据交互。
     */

    private Socket socket;

    /**
     * 客户端构造方法，使用初始化客户端
     */

    public Client(){

        try {

            /**
             * Socket常用构造方法：
             * Socket(String host,int port)
             * 实例化Socket的过程就是与服务端建立连接的过程，
             * 如果指定的位置找不到服务器则会抛出异常！
             * 指定的位置找不到服务端则会抛出异常
             * 参数1：服务器的IP地址信息
             * 参数2：服务器开启的服务端口
             * 我们可以通过IP找到网络上服务端所在的计算机，
             * 通过端口可以连接到该计算机上的服务端应用程序。
             */

            System.out.println("正在连接服务端。。。");
//            socket = new Socket("176.20.97.72",8088);
           socket = new Socket("localhost",8088);    //localhost:176.20.97.33
            System.out.println("与服务端建立连接！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start(){
        try {

            /**
             * Socket提供的方法：
             * OutputStream getOutputStream()
             * 通过socket获取的输出流写出的字节会发送给连接的远端计算机
             */

            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);


            while (true){

                Scanner input = new Scanner(System.in);
                System.out.print("你说：");


                if ("exit".equals(input)){
                    input.close();
                    System.out.println("服务器已关闭，感谢使用！");
                    break;
                }
                String regex = "(wqnmlgb|nmb|cnm|nc|djb|dsb|wrsndm|nmsl|狗东西|日|我去你妈了个逼|尼玛|草尼玛|你妈逼|操你妈|脑残|大鸡巴|我日死你的妈|你妈死了|草泥马|大傻逼|傻逼|小人贱人|坏人|坏蛋|王八蛋|狼心狗肺|狗仗人势|禽兽不如|狼狈为奸|衣冠禽兽|猪狗不如|忘恩负义|为虎作伥|恩将仇报|指鹿为马|贼眉鼠眼|粉墨登场|鼠目寸光|祸国殃民|卑鄙无耻|丧心病狂|丧尽天良|吃里扒外|心怀叵测|井底之蛙|厚颜无耻|小肚鸡肠)";
                String massege = input.nextLine();
                String masseges = massege.replaceAll(regex, "xxx");

                pw.println(masseges);
                System.out.println("向服务端发送了一条消息");
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }

}
