package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后推出了一个新的特性：lambda表达式
 * lambda可以以更精简的语法创建匿名内部类
 * 语法：
 * （参数列表）->{
 *     方法体
 * }
 * 注：使用lambda创建匿名内部类时所实现的接口只能有一个抽象方法
 */

public class LambdaDemo {
    public static void main(String[] args) {

        File file1 = new File(".");

        FileFilter fileter = new FileFilter(){
            public boolean accept(File file) {
                return file.getName().endsWith(".txt");
            }
        };


        /**
         * lambda表达式
         */
        FileFilter filter1 = (File file)->{
          return file.getName().endsWith(".txt");
        };

        /**
         * 更精简方法
         * 方法参数的类型可以忽略不写
         */
        FileFilter filter2 = (file)->{
            return file.getName().endsWith(".txt");
        };

        /**
         * 如果方法中只有一句代码，则方法{}可以忽略不写
         * 如果这句话有return，则return也 **必须** 忽略
         */
        FileFilter filter3 = (file)->file.getName().endsWith(".txt");

        /**
         * 如果只有一个参数，那么参数的（）可以忽略不写
         * 这样也可以
         */
        FileFilter filter4 = file->file.getName().endsWith(".txt");

//        File dir = new File(".");
//        File[] subs = dir.listFiles(filter4);
//        System.out.println(subs);

//        不能这样用
//        File dir = new File(".");
//        File[] subs = dir.listFiles(
//            public boolean accept(File file) {
//                return file.getName().endsWith(".txt");
//            }
//        );


        File dir = new File(".");
        File[] subs = dir.listFiles(
                file->file.getName().endsWith(".txt")
        );

        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
    }
}
