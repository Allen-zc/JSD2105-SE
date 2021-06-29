package io;

import java.io.*;

/**
 * 使用缓冲流完成文件的复制操作
 *
 * 缓冲流：
 * java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲流是一对高级流，在流连接中的作用是提高读写字节数据的高效。
 */

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {


        FileInputStream fis
                = new FileInputStream("F:/Chrome Download/ituring_books-master/ituring_books-master/图灵程序设计丛书/[图灵图书].写给大家看的项目管理书.第2版.pdf");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos
                = new FileOutputStream("F:/Chrome Download/ituring_books-master/ituring_books-master/123/[图灵图书].写给大家看的项目管理书.第2版.pdf");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024*10);

        int d;

        long start = System.currentTimeMillis();

        while ((d = bis.read())!= -1){
            bos.write(d);
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时：" + (end-start) + "ms");


    }
}
