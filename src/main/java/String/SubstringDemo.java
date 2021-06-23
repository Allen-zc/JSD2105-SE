package String;

/**
 * String substring(int start,int end)
 * 截取当前字符处中制定范围内的字符串，
 * 两个参数分别表示开始位置和结束位置，
 * 注：在JAVA API中有一个特点，通常使用两个数字表示范围时都是“含头不含尾”的，
 *      即：包含开始位置的内容但是不包含结束位置的内容
 */

public class SubstringDemo {
    public static void main(String[] args) {
            //  0 1 2 3 4 5 6 7 8 9 10
        String str = "www.tedu.com";

        //截取域名：tedu
        String sub = str.substring(4,8);
        System.out.println(sub);

        //重载的方法从指定位置开始截取到字符串末尾
        String sub1 = str.substring(4);
        System.out.println(sub1);

    }
}
