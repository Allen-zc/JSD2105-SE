package io;

import java.io.*;

public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "夜空中最亮的星！";
        byte[] data = line.getBytes("UTF-8");
        bos.write(data);

        /**
         * void flush()方法
         * 该方法是所有输出流共有的方法，定义在超类上，作用是将缓冲流的缓冲区中已经缓存的数据一次性写出。
         */
        bos.flush();

        System.out.println("写出完毕！");
        bos.close();
    }
}
