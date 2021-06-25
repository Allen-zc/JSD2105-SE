package file;

import java.io.File;

/**
 * 创建一个目录
 */

public class MkDirDemo {
    public static void main(String[] args) {
        //在当前项目目录下新建一个目录demo
//        File dir = new File("./demo");
        File dir = new File("./a/b/c/d/e/f");

        if (dir.exists()){
            System.out.println("该目录已存在！");
        }else {
//            dir.mkdir();
            dir.mkdirs();   //比.mkdir好
            System.out.println("目录创建成功！");
        }
    }
}
