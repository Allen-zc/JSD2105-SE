package io;

import java.io.*;

/**
 * Java IO将流按照读写数据的单位划分为：字节流与字符流
 * java.io.InputStream和OutputStream是所有字节流的超类，比如
 * 文件流、缓冲字节流、对象流都继承自上述的两个超类，读写单位最小的是以字节为单位进行的。
 *
 * java.io.Reader和Writer是所有字符流的超类，读写单位最小是以char（字符为单位进行的）。
 * 字符流底层本质还是要进行字符与字节的转换（因为计算机底层只有2进制）
 * 但是字符流为我们提供的便利是可以让我们直接读写文本数据。
 * 因此注意：字符流仅适合读写文本数据！
 *
 * 转换流
 * 转换流是一对高级流，实际开发中我们不直接操作这对流，但是在流连接中他们是
 * 非常重要的一环，负责衔接其他字符流与下面的字节流，并进行着字符与字节的转换工作。
 */

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        //字符流支持直接传入一个字符串作为参数将其写出
        osw.write("我可以接受你的所有，所有小脾气。");
        osw.write("我可以带你去吃很多，很多好东西。");
        System.out.println("写出完毕！");
        osw.close();

    }
}
