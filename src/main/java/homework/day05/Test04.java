package homework.day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 将当前目录下的所有obj文件获取到，并进行
 * 反序列化后输出每个用户的信息(直接输出反序
 * 列化后的User对象即可)
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        //获取当前目录下的所有.obj文件
        File dir = new File(".");
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".obj"));

        for (int i = 0; i < subs.length; i++) {
            File sub = subs[i];//获取每一个.obj文件
            try{
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(sub));
                Object obj = ois.readObject();
                if (obj instanceof User){
                    User user = (User)obj;
                    System.out.println(user);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
