package String;

/**
 * boolean startsWith(String str)
 * boolean endsWith(Sting str)
 * 判断字符串是否以给定的内容开始或者结束的
 */

public class StartsWithDemo{
    public static void main(String[] args) {
        String line = "www.tedu.cn";
        boolean starts = line.startsWith("www.");
        System.out.println("start:" + starts);

        boolean ends = line.endsWith(".com");
        System.out.println("ends:" + ends);
    }

}
