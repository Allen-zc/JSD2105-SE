package collection;

import java.util.Arrays;

/**
 * JDK1.5时推出的另一个特性:变长参数
 * 一个方法中只能声明一个变长参数,并且必须是最后一个参数
 */

public class AryDemo {
    public static void main(String[] args) {

        dosome(1,"a");
        dosome(2,"a","b");
        dosome(3,"a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c");
        dosome(1,new String[]{"1","2"});

    }

    public static void dosome(int i,String... s){
        /**
         * 变长参数在方法中实际上就是一个数组,给变长参数传入了几个
         * 实参,该数组长度与实参个数一致,
         */
        System.out.println(s.length);
        System.out.println("s:" + Arrays.toString(s));
    }
}
