package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为List集合
 * 数组的工具类Arrays提供了一个静态方法:asList,可以将一个数组转换为
 * 一个List集合
 */

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        System.out.println("array:" + Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);
        System.out.println("list:" + list);

        list.set(1,"six");
        System.out.println("list:" + list);
        /**
         * 对数组转换的List进行的操作就是对原数组对应的操作
         */
        System.out.println("array:" + Arrays.toString(arr));

        /**
         * 由于数组是定长的,因此该集合会影响元素个数的操作都是不支持的操作,
         * 会抛出异常:UnsupportedOperationException  //不允许的
         */
//        list.add("seven");
//        System.out.println("list:" + list);
//        System.out.println("array:" + Arrays.toString(arr));

        /**
         * 若想增删元素,只能自行创建一个集合并包含数组转换的集合中
         * 所有元素后再进行相关操作
         */
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.addAll(list);

        /**
         * 所有的集合都支持一个参数为Collection的构造方法,
         * 作用是在创建当前集合的同时包含给定集合中的所有元素
         */
        List<String> list2 = new ArrayList<>(list);
        System.out.println("list2:" + list2);
        list2.add("seven");
        System.out.println("list2:" + list2);
    }
}
