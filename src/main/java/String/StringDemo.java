package String;

import java.util.Arrays;

/**
 *
 * String 字符串
 * 字符串是不变对象，即：字符串一旦创建内容不可改变，改变一定创建新对象。
 * 这是由于JAVA对字符串的优化导致的
 * 字符串的一个优化为：常量池
 * 常量池是在堆内存中开辟的一段空间，由于缓存所有使用字面量形式创建的字符串，
 * 当我们使用已有的字面量再次创建字符串时会重用对象来避免内存中堆积大量内容相同的字符串。
 *
 */

public class StringDemo {
    public static void main(String[] args) {

        String s1 = "123abc";   //"123abc"是一个常量
        String s2 = "123abc";   //重用s1对象，指向"123abc"这个常量
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1==s2);

        String s3 = "123abc";
        System.out.println("s3:" + s3);
        System.out.println(s2==s3);

        /**
         *  new 是强制操作，一定创建新对象
         *  面试题经常问：下面代码创建了几个字符串对象？
         *  String s4 = new String("123abc");
         *  答：两个，第一个是参数“123abc”这个字面量产生的字符串对象
         *          第二个是new String()产生的字符串对象
         */
        String s4 = new String("123abc");
        System.out.println("s4:" +s4);
        System.out.println(s2 == s4);

        s1 = s1 + "!";  //字符串是不变对象，修改内容会创建新对象
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1 == s2);   //s1与s2的地址不同了

        /**
         * 字符串判断“相等”绝大多数的情况都是判断字符串的内容是否相同，
         * 因此实际开发中我们都是使用字符串提供的方法equals来判断两个字符串
         * 对象的内容是否相同
         */
        //s2和s4虽然不是同一个对象，但是字符串内容都是“123abc”，因此equals为TRUE
        boolean equal = s2.equals(s4);  //使用equals判断两个字符串的内容是否相同
        System.out.println(equal);

        /**
         * 编译器有一个特性：如果在编译期间可以确定一个计算表达式结果的时候编译器就会进行计算并将结果放在编译后的class文件中。
         * 这样一来JVM每次执行时就无需每次计算了。
         * 下面的代码会被编辑器计算并改为:
         * String s5 = "123abc";    //JVM运行时就会重用常量池对象
         */
        String s5 = "123" + "abc";
        System.out.println(s5);
        System.out.println(s2 == s5);
        System.out.println(s2.equals(s5));

        String s = "123";
        String s6 = s + "abc";
        System.out.println("s6:" + s6);
        System.out.println(s2 == s6);

        String s7 = "1" + 23 + "abc";
        System.out.println("s7:" + s7);
        System.out.println(s2 == s7);
    }
}
