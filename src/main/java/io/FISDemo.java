package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，用于从文件中读取字节数据
 */

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.txt");

        int d = fis.read();
        System.out.println(d);

        /**
         * int read()
         * 从文件中读取一个字节，
         * 返回的int值的2进制最低八位就是读取到的字节数据，
         * 如果返回的int值为-1则表示读取到了文件末尾。
         *
         * fos.dat文件中：
         * 00000001 00000010
         * ^^^^^^^^
         * 返回值d:00000000 00000000 00000000 00000001
         *
         */
        int d1 = fis.read();
        System.out.println(d1);

        int d2 = fis.read();
        System.out.println(d2);

        fis.close();
    }
}
