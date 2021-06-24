package object;

/**
 * 测试经常使用的Object中定义的方法
 */

public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        /**
         * 我们经常使用System.out.println()输出一个对象的内容。
         * 实际上该对象会将传入的对象调用它的toString方法（Object提供的方法）
         * 将其转换为一个字符处后，将该字符串内容输出到控制台。
         * Object提供的toString方法返回的字符串格式：类名@地址
         * 实际开发中帮助不大，我们通常输出希望看到的是该对象保存的内容，因此
         * 我们可以妥善的重写toString方法，使得输出时更有意义
         */
        System.out.println(p);

        /**
         * 在字符串连接操作中，非字符串类型在拼接时也是调用其toString方法先将其
         * 转换为String后进行的连接操作
         */
        String line = "Point:"+p;
        System.out.println(line);

        Point p2 = new Point(1, 2);

        /**
         * ==是值比较，对于引用类型变量而言存的是地址，因此==是比较是否为同一个对象
         */
        System.out.println(p == p2);    //false

        /**
         * equals方法并不关心是否为同一个对象，而是比较两个对象的内容是否相同
         * 但是如果子类不重写Object中的equals方法，则equals方法没有实际意义，
         * 原因是Object提供的equals内部就是使用==比较的。
         */
        System.out.println(p.equals(p2));   //true×     //实际上是false       //现在重写了才为true

    }
}
