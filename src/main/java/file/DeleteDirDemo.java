package file;

import java.io.File;

/**
 * 删除一个目录
 */

public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前项目目录下的demo目录删除
        File dir = new File("demo");
        if (dir.exists()){

            /**
             * 使用delete方法删除目录时要求该目录必须是一个空目录才可以将其删除
             */

            dir.delete();   //如果目录中有东西，则用delete无法删除
            System.out.println("目录已删除！");
        }else {
            System.out.println("目录不存在！");
        }
    }
}
