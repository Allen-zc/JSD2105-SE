package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓存字符流
 * 缓冲字符流是一对高级流，在流连接中的作用是提高读写文本数据，并且可以按行读写字符串
 * java.io.BufferedReader和BufferedWriter
 *
 * 实际开发中缓冲字符输出流我们更加常用的是PrintWriter，具有自动行刷新功能的
 * 缓冲字符输出流，其内部总是连接BufferedWriter作为缓冲加速作用
 *
 */

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /**
         * PrintWriter提供了堆文件操作的构造方法
         * PrintWriter(String path)
         * PrintWriter(File file)
          */
        //向文件中写入字符串
        PrintWriter pw = new PrintWriter("pw.txt", "UTF-8");
        pw.println("我看过沙漠下暴雨");
        pw.println("看过大海亲吻鲨鱼");
        pw.println("看过黄昏追逐黎明");
        pw.println("没看过你");
        System.out.println("写出完毕！");
        pw.close();
    }
}
