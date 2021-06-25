package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载的listFiles方法
 * File[] listFiles(FileFilter filter)
 * 该方法要求我们传入一个文件过滤器，然后仅将该目录中满足这个过滤器要求的子项返回。
 */

public class ListFilesDemo2 {
    public static void main(String[] args) {
        //获取当前目录下的所有文本文件（.txt文件）
        File dir = new File(".");
//        MyFilter myFilter = new MyFilter();   //过滤器

        /**
         * 使用匿名内部类形式定义过滤器
         */
        FileFilter fileter = new FileFilter(){  //过滤器
            public boolean accept(File file) {
                String name = file.getName();
                System.out.println("正在过滤：" + file);
                return name.endsWith(".txt");
            }
        };

        if (dir.isDirectory()){
            File[] subs = dir.listFiles(fileter);
            System.out.println("文件长度为：" + subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}

//class MyFilter implements FileFilter {
//
//    public boolean accept(File file) {
//        String name = file.getName();
//        System.out.println("正在过滤：" + file);
//        return name.endsWith(".txt");
//    }
//}