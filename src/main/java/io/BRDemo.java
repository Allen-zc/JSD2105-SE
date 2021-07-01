package io;

import java.io.*;

/**
 * 使用缓冲字符输入流按行读取文本数据
 */

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        /**
         * String readLine()
         * 返回一行字符串（读取到换行符，并将换行符之前的内容返回）
         * 如果返回值为null则表示读取到了末尾。
         */

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
