package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件中写入文本数据
 */

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {

        /**
         * 文件流默认的创建方式称为覆盖模式
         * 即：如果指定的文件存在，则创建文件流时会将该文件原有的数据
         * 全部抹除，然后将写入的数据全部保存到文件中。
         * 
         * 文件流支持一个重载的构造器，允许我们在传入一个boolean值
         * 作为参数，如果这个值为true,则当前文件流为追加默认，即：
         * 创建文件流时若指定的文件存在，则原数据保留，新写入的数据都
         * 会顺序追加到文件末尾。
         * FileOutputStream(String path,boolean append)
         * FileOutputStream(File file,boolean append)
         */

        FileOutputStream fos = new FileOutputStream("fos.txt",true);
//        String line = "宝，我今天去输液了，输的什么液？想你的夜。";
        String line = "想你的液\n";
//        line.getBytes(StandardCharsets.UTF_8);
        byte[] data = line.getBytes("UTF-8");
        fos.write(data);
        System.out.println("写入完毕！");
        fos.close();
    }
}
