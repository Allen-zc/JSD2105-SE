package file;

import java.io.File;

/**
 * java.io.file类
 * 该类的每一个实例化用于表示硬盘上的一个文件或者目录（实际表示的是一个抽象路径）
 * 操作系统中有一个子系统称为：文件系统，是用来管理硬盘的，它将数据保存在文件中，并使用
 * 目录来归类，File就是用来访问文件系统中的文件和目录的
 *
 * File可以：
 * 1.访问其他的文件或者目录的属性信息，比如：名字、大小、修改时间等
 * 2.可以创建或者删除文件和目录
 * 3.可以访问一个目录中的子项
 * 但是不能访问文件数据（Java中有其他API可以做这个事情）
 */

public class FileDemo {
    public static void main(String[] args) {
        //访问当前目录下的test.txt文件
//        File file = new File(
//                "E:/idea_workspace/JSD2105_SE/test.txt"
//        );

        /**
         * 实际开发中，我们使用路径时都是使用的相对路径，它有更好的跨平台性。
         * "./"称为当前目录，当前目录是那里要视当前程序的运行环境而定，如果是在
         * idea中执行我们的程序，那么当前目录就是当前程序所在的项目目录
         */
        File file = new File("./text.txt");

        String name = file.getName();   //获取当前文件的文件名
        System.out.println(name);

//        返回文件大小，单位是字节
        long length = file.length();    //获取当前文件的文件大小
        System.out.println("文件大小为：" + length);

        boolean canRead = file.canRead();   //获取当前文件是否可读
        System.out.println("可读：" + canRead);

        boolean canWrite = file.canWrite(); //获取当前文件是否可写
        System.out.println("可写：" + canWrite);

        boolean hidden = file.isHidden();   //获取当前文件是否隐藏
        System.out.println("是否隐藏：" + hidden);

        String filePath = file.getAbsolutePath();   //获取当前文件的绝对路径
        System.out.println("文件路径：" + filePath);

    }
}
