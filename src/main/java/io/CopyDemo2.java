package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写的次数可以提高读写效率
 * 一次读写一个字节的形式是一种随机读写形式，
 * 而一次读写一组字节的形式是块读写形式。
 */

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis
                = new FileInputStream("F:/Chrome Download/ituring_books-master/ituring_books-master/图灵程序设计丛书/[图灵图书].写给大家看的项目管理书.第2版.pdf");
        FileOutputStream fos
                = new FileOutputStream("F:/Chrome Download/ituring_books-master/ituring_books-master/123/[图灵图书].写给大家看的项目管理书.第2版.pdf");
        /**
         * 块读：
         * int read(byte[] data)
         * 一次性读取给定的字节数组总长度的字节量并存入到该数组中
         * void write(byte[] data)
         * 一次性将给定的字节数组中所有字节写出
         * void write(byte[] data,int offset,int len)
         * 将给定的字节数组从下标offset处开始的连续len个字节一次性写出
         *
         */

        byte[] data = new byte[1024 * 10];
        int len;    //每次读取到的字节量

        long start = System.currentTimeMillis();
        while ((len = fis.read(data))!= -1){
            fos.write(data,0,len);
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时：" + (end-start) + "ms");


        fis.close();
        fos.close();


    }
}
