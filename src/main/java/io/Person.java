package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象序列化
 */

public class Person implements Serializable {
    private String name;    //名字
    private int age;    //年龄
    private String gender;  //性别

    /**
     * transient关键字
     * 当一个对象在序列化时，会忽略所有被transient修饰的属性。
     * 忽略不必要的属性可以达到对象序列化的“瘦身”工作，减小开销。
     */

    private transient String[] otherInfo; //其他信息

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

}
