package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 */

public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个demo.txt文件
        File file = new File("./demo.txt");

        /**
         * boolean exists()
         * 判断当前File表示的文件或目录是否已经存在
         */
        if (file.exists()){
            System.out.println("该文件已存在！");
        }else {
            /**
             * createNewFile()方法用于将File表示的文件创建出来
             * 光标停留在报错的位置按alt+enter 选"add exception to method signature"先将异常抛出
             */
            file.createNewFile();
            System.out.println("创建成功！");
        }


    }
}
