package String;

/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，如果给定的字符串在当前字符串中不存在则返回值为-1
 */

public class IndexOfDemo {
    public static void main(String[] args) {
        //      0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        String str = "thinking in java";

        //检索第一次出现“in”的位置
        int index = str.indexOf("in");
        System.out.println(index);  //2

        //从下标3（第四个字符处开始）开始第一次出现“in”的位置
        int index1 = str.indexOf("in", 3);
        System.out.println(index1);    //5

        //检索最后一次出现“in”的位置
        int index2 = str.lastIndexOf("in");
        System.out.println(index2);     //9

    }
}
