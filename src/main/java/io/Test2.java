package io;

import java.io.*;
import java.util.Scanner;

/**
 * 实现简易记事本工具
 * 程序启动后，要求用户输入一个文本名，然后堆该文件写操作。
 * 之后用户输入的每一啊很难过字符串都能按行写入到该文件中。
 * 当用户单独输入exit时程序退出。
 *
 */

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println("---------------简易记事本---------------");
        System.out.print("请输入文本名：");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();

        FileOutputStream fos = new FileOutputStream(filename);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);

        /**
         * 在流连接中创建PrintWriter时可以再传入一个boolean型的参数
         * 如果这个值为true，则当前PrintWriter就具有了自动行刷新功能。
         * 即：每当我们调用println方法后会自动flush。
         */

        PrintWriter pw = new PrintWriter(bw);
        System.out.println("请输入内容,单独输入exit时退出：");

        do {
            String line = scan.nextLine();
            if ("exit".equals(line)){
                break;
            }
            pw.println(line);
//            pw.flush(); //行刷新

        }while (true);
        System.out.println("欢迎下次使用");
        pw.close();
    }
}
