package String;

/**
 *  String提供了一组重载的静态的valueOf方法，作用是将其他类型转换为String
 *  比较常见的是将基本类型转换为String
 */

public class ValueOfDemo {
    public static void main(String[] args) {

        int a = 123;
        String s1 = String.valueOf(a);
        System.out.println(s1);

        double d = 123.123;
        String s2 = String.valueOf(d);
        System.out.println(s2);

        //  这个方法可以，但是不好
        String s3 = a+ "";
        System.out.println(s3);
    }
}
