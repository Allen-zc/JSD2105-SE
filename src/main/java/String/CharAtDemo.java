package String;

/**
 * char charAt(int index)
 * 获取当前字符串中指定位置处的字符
 */

public class CharAtDemo {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9 10
        String line = "thinking in java";
        char c = line.charAt(9);
        System.out.println(c);

        //检索回文
        //           0 1 2 3 4 5 6 7 8
        String str = "上海自来水来自上海";
        boolean check = true;   //默认是回文
        for (int i = 0; i < str.length()/2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() -1 -i);
            if (c1!=c2){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文!");
    }
}
