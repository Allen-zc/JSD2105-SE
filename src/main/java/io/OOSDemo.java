package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对高级流，在流连接中的作用是进行对象的序列化与反序列化的。
 * 对象序列化：将对象按照其结构转换为一组字节
 * 反序列化：将一组字节还原为java文件
 *
 */

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个Person对象写入文件person.obj中
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"电影演员","来自岛国","启蒙老师","爱好写毛笔字"};

        Person p = new Person(name, age, gender, otherInfo);
        System.out.println(p);

//        FileOutputStream fos = new FileOutputStream("person.obj");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /**
         * 对象输出流提供的方法：
         * void writeObject(Object obj)
         * 该方法会将给定的对象按照其结构转换为一组字节，但是要求该对象所属的类必须实现可序列化接口，否则会抛出异常：
         * java.io.NotSerializableException     不可序列化异常
         */
//        oos.writeObject(p);
        System.out.println("写出完毕！");
//        oos.close();
    }
}
