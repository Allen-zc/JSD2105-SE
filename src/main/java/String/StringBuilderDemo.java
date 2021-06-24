package String;

/**
 * String的优化导致字符串不适合频繁修改（开销大，性能低）
 * JAVA提供了一个专门用于修改字符串内容的API:StringBuilder
 * 其内部维护一个可变的char数组，修改性能好，开销小，并且由于是专门修改字符串的API
 * 对此提供了一套修改字符串的方法：增、删、改、插等操作
 */

public class StringBuilderDemo {
    public static void main(String[] args) {

        String line = "好好学习java";

        /**
         * StringBuilder常见的构造方法：
         * StringBuilder()无参构造器创建的StringBuilder内部表示空字符串
         *
         * StringBuilder(String str)将给定字符串内容复制一份到StringBuilder
         *
         */

//        StringBuilder builder = new StringBuilder();    //""
        StringBuilder builder = new StringBuilder(line);

        /**
         * StringBuilder与StringBuffer的功能是完全一样的。
         * StringBuffer出现在JDK1.0，而StringBuilder出现在JDK1.5
         * 区别在于：StringBuilder不是线程安全，而StringBuffer是线程安全的
         */
//        StringBuffer builder = new StringBuffer();


        /**
         * 好好学习java
         * 好好学习java，为了找个好工作！
         * append：追加内容
         */

        builder.append(",为了找个好工作！");
        System.out.println(builder);

        /**
         * 好好学习java，为了找个好工作！
         * 好好学习java，就是为了改变世界！
         * replace()：替换字符串部分内容
         */

        builder.replace(9,16,"就是为了改变世界");
        System.out.println(builder);

        /**
         * 好好学习java，就是为了改变世界！
         * ，就是为了改变世界！
         * delete：删除当前字符串中的部分内容
         */
        builder.delete(0,8);
        System.out.println(builder);

        /**
         * ,就是为了改变世界！
         * 活着,就是为了改变世界！
         * insert：将给定内容插入到指定位置
         */
        builder.insert(0,"活着");
        System.out.println(builder);

        /**
        StringBuilder str = new StringBuilder("a");
        for (int i = 0; i < 10000000; i++) {
            str.append("a");
        }
        System.out.println(str);
         */

        /**
         * 活着,就是为了改变世界！
         * ！界世变改了为是就,着活
         * reverse：将StringBuilder内容进行反转
         */
        builder.reverse();
        System.out.println(builder);

        /**
         * StringBuilder支持String的相关方法
         */
        int len = builder.length();
        System.out.println(len);

        /**
         * 可以调用toString方法将StringBuilder内部表示的内容转换为String返回
         */
        String str2 = builder.toString();
        System.out.println(str2);

    }
}
