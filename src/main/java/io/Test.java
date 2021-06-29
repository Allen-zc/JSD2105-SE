package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 实现简易记事本工具
 * 程序启动后在控制台输入的每一行字符串都能顺序写文件note.txt。
 * 当单独输入exit时程序退出。
 */

public class Test {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("note.txt",true);
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------记事本---------------");
        System.out.println("请在下方输入需要记录的事项,单独输入exit时退出：");
        System.out.print("记录：");
        do {
            String sc = scan.nextLine();
            if ("exit".equals(sc)){
                break;
            }
            byte[] txt = sc.getBytes("UTF-8");
            String huanhang = "\n";
            byte[] bytes = huanhang.getBytes("UTF-8");
            fos.write(txt);
            fos.write(bytes);
        }while (true);
        fos.close();
        System.out.println("记事本已关闭！再见！");
    }
}
