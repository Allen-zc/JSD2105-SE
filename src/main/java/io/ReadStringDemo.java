package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 从文件中读取字符串
 */

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] data = new byte[1000];
        int len = fis.read(data);
        System.out.println("实际读取到的字节数：" + len);

        String line = new String(data,0,len, "utf-8");
        System.out.println(line);
        fis.close();
    }
}
