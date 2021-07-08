package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 并发安全的集合
 * Collections提供了将当前集合转换为并发安全集合的方法，在多线程
 * 并发操作集合时应当使用并发安全的集合
 *
 * ArrayList,LinkedList,HashSet都不是并发安全的集合
 */

public class SyncCollectionDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        //将给定的List集合转换为一个线程安全的List集合
        list = Collections.synchronizedList(list);  //.synchronizedList()

        System.out.println(list);

        /**
         * JDK8之后，java推出了一种新的遍历集合的方法。
         * Collection中添加了forEach方法，可以通过lambda表达式
         * 形式遍历集合元素，由于该犯法是集合自身方法，因此可以和集合
         * 自身其他操作（比如增删元素）互斥。因此在多线程操作集合时
         * 我们首先要求集合要使用并发安全的集合，并且遍历操作采用
         * forEach进行。
         */

//        Iterator<String> it = list.iterator();


        list.forEach(e-> System.out.println(e));     //.forEach(e-> System.out.println(e))   ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐

        list.forEach(System.out::println);      //.forEach(System.out::println)         ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐



    }
}
