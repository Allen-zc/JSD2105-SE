package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * List集合
 * java.util.List接口,继承自Collection
 * List集合可以存放重复元素,并且有序,提供了一套可以通过下标操作元素的方法
 * 常用实现类:
 * java.util.ArrayList:内部使用数组实现,查询性能更好
 * java.util.LinkedList:内部使用链表实现,增删性能更好
 */

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /**
         * E get(int index)
         * 获取指定下标对应的元素.
         */
        String str = list.get(2);
        System.out.println(str);

        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            System.out.println(str);
        }

        /**
         * E set (int index,E e)
         * 将给定元素设置到指定位置,返回值为该位置原有元素.
         * 此操作为替换元素
         */
        //[one,two,six,four,five]
        String old = list.set(2, "six");
        System.out.println(list);
        System.out.println("old:" + old);

        //将集合反转
        //方法一:
        Collections.reverse(list);

        //方法二:
        for (int i = 0; i < list.size() / 2; i++) {
            String s = list.get(i);
            s = list.set(list.size() - 1 - i, s);
            list.set(i,s);
        }

        //方法三:
        //[five,four,six,two,one]
        for (int i = 0; i < list.size()/2; i++) {
            list.set(i,list.set(list.size()-1-i,list.get(i)));
        }


        System.out.println(list);
    }
}
