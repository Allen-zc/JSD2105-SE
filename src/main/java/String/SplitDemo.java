package String;

import java.util.Arrays;

/**
 * String[] Split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分的所有部分以一个数组形式返回
 */

public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        //将字符串按照数字部分拆分出每个字母部分
        String[] arr = line.split("[0-9]+");
        System.out.println(Arrays.toString(arr));
        /**
         * 输出结果：[abc, def, ghi]
         */

        String line1 = "abc.def.ghi";
        String[] arr1 = line1.split("\\.");
        System.out.println(Arrays.toString(arr1));
        /**
         * 输出结果：[abc, def, ghi]
         */

        String line2 = "abc,def,ghi";
        String[] arr2 = line2.split(",");
        System.out.println(Arrays.toString(arr2));
        /**
         * 输出结果：[abc, def, ghi]
         */

        String line3 = "abc,,def,,ghi";
        String[] arr3 = line3.split(",");
        System.out.println(arr3.length);
        System.out.println(Arrays.toString(arr3));
        /**
         * 输出结果：
         * 5
         * [abc, , def, , ghi]
         */

        String line4 = ",abc,,def,,ghi";
        String[] arr4 = line4.split(",");
        System.out.println(arr4.length);
        System.out.println(Arrays.toString(arr4));
        /**
         * 输出结果：
         * 6
         * [, abc, , def, , ghi]
         */

        String line5 = ",abc,,def,,ghi,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,";
        String[] arr5 = line5.split(",");
        System.out.println(arr5.length);
        System.out.println(Arrays.toString(arr5));
        /**
         * 输出结果：
         * 6
         * [, abc, , def, , ghi]
         */
    }
}
