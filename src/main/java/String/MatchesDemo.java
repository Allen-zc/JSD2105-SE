package String;

/**
 * String支持正则表达式的方法一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串的内容是否符合要求
 */

public class MatchesDemo {
    public static void main(String[] args) {
        String email = "fancq@tedu.cn";
        /**
         * 邮箱的正则表达式：
         * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        if (email.matches(regex)){
            System.out.println("是邮箱");
        }else {
            System.out.println("不是邮箱");
        }
    }
}
