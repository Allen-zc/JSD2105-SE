package String;

/**
 * String trim()
 * 去除当前字符串两侧的空白字符
 */

public class TrimDemo {
    public static void main(String[] args) {
        String str = "  hello      ";
        String newstr = str.trim();
        System.out.println(str + str.length());
        System.out.println(newstr + newstr.length());
    }
}
