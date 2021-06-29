package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO 输入与输出
 * Java的IO是用来完成我们的程序与外界交换数据的方式，并且将输入与输出
 * 按照方向分为读与写操作。其中
 *      输入 负责 读取，是 外界到程序 的方向
 *      输出 负责 写，是 程序到外界 的方向。
 *
 * Java中定义的输入流和输出流可以看做是连接程序与外界设备的“管道”，而管道中向这同一方向顺序移动字节数据。
 *
 * 实际开发中，读写不同的设备我们会使用专门的输入与输出流，好比我们读写文件就可以使用文件输入与输出流。
 *
 * Java中定义了输入流与输出流的超类，用于规范输入与输出的读写操作。
 * java.io.InputStream是输入流的超类，所有字节输入流都继承自它。
 * java.io.OutputStream是输出流的超类，所有字节输出流都继承自它。
 *
 * JAVA将流分为两类：节点流和处理流
 * 节点流：也称为低级流，是真实连接程序与另一端的”管道“，负责实际读写数据的流，IO操作一定是基于某个节点流基础上进行的。
 * 处理流：也称为高级流，它不能独立存在，必须连接在其他流上，目的是当数据流经过当前流时对其惊醒某些加工操作，使得我们读写数据得以简化。
 * 实际开发中我们经常会串联一组高级流到某个低级流上，读写数据以流水线式的加工处理，这也称为”流的连接“。
 *
 *
 * 文件流（是一对低级流）
 * java.io.FileInputStream和FileOutputStream
 * 它们是用来读写文件数据的流，是连接程序与文件之间的“管道”。
 */

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向当前目录下的文件fos.txt中写入字节
        /**
         * 文件输出流常见的构造方法
         * FileOutputStream(String path)
         * FileOutputStream(File file)
         */
        FileOutputStream fos = new FileOutputStream("./fos.dat");

        /**
         * void write(int d)
         * 向文件中写入1个字节，写入的内容是给定的int值对象的二进制的“低八位”
         *
         * int型1对应的2进制:           vvvvvvvv
         * 00000000 00000000 00000000 00000001
         *
         * fos.dat文件中:
         * 00000001
         */

        fos.write(1);

        /**
         * 2的2进制:                   vvvvvvvv
         * 00000000 00000000 00000000 00000010
         *
         * fos.dat文件中:
         * 00000001 00000010
         */
        fos.write(2);

        System.out.println("写出完毕！");
        fos.close();
    }
}
