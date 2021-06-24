package String;

/**
 * 频繁修改字符串的性能问题
 */

public class StringDemo2 {
    public static void main(String[] args) {

        String str = "a";
        for (int i = 0; i < 10000000; i++) {
            str =  str + "a";
        }
        System.out.println("执行完毕！");

//        c语言
//        int a =  maloc(4);
//        a= 1;
//        free(a);



    }
}
