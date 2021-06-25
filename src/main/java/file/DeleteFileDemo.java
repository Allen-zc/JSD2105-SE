package file;

import java.io.File;

/**
 * 删除一个文件
 */

public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前项目下的demo.txt文件删除
        //相对路径中"./"可以忽略不写，默认就是从"./"开始的
        File file = new File("demo.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件已删除！");
        }else {
            System.out.println("文件不存在");
        }

    }
}
