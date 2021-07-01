package io;

import java.io.*;

/**
 * 在流连接中使用PW
 */

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //低级流，文件输出流，作用：向文件中写入字节数据
        FileOutputStream fos = new FileOutputStream("pw2.txt");

        //高级流，转换输出流，作用：1衔接其他字符流与字节流 2将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

        //高就流，作用：块写文本数据加速
        BufferedWriter bw = new BufferedWriter(osw);

        //高级流，作用：可以按行写出字符串，并且可以自动行刷新
        PrintWriter pw = new PrintWriter(bw);

        pw.println("你好");
        pw.println("再见");
        System.out.println("写入完毕！");
        pw.close();
    }
}
