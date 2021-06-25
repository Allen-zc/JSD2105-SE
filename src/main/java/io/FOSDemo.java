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
 * 文件流
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
        FileOutputStream fos = new FileOutputStream("./fos.txt");

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
