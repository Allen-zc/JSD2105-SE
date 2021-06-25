package lambda;

import java.io.File;

/**
 * 使用lambda表达式创建文件过滤器，获取当前目录下所有名字中含有s的子项
 */

public class Test {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] subs = dir.listFiles(
                file->file.getName().contains("s")
        );

        for (int i = 0; i < subs.length; i++) {
            System.out.println(subs[i].getName());
        }
    }
}
