package String;

/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全大写或者全小写
 *
 */

public class ToUpperCaseDemo {
    public static void main(String[] args) {
        //将字符串转换为全大写
        String str = "我爱Java";
        System.out.println(str.toUpperCase());

        //将字符串转换为全小写
        String lower = "I LOVE JAVA";
        System.out.println(lower.toLowerCase());
    }
}
