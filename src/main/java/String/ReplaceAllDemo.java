package String;

/**
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换成给定内容
 */

public class ReplaceAllDemo{
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        //将当前字符串中的 数字 部分替换为 "#NUMBER#"
        String line1 = line.replaceAll("[0-9]+", "#NUMBER#");
        System.out.println(line1);
        /**
         * 输出结果为：abc#NUMBER#def#NUMBER#ghi
         */

        String line2 = "abc123def456ghi";
        //将当前字符串中的 字母 部分替换为 "#NUMBER#"
        String line4 = line2.replaceAll("[a-zA-Z]+", "#NUMBER#");
        System.out.println(line4);
    }
}
