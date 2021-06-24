package homework;

import java.util.Scanner;

/**
 * 要求用户在控制台输入自己的用户名。
 * 然后要求做如下验证工作:
 * 1:用户名不能为空(只要有一个字符)
 * 2:用户名必须在20个字以内
 * @author Xiloer
 *
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.print("请输入您的用户名：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        checkUserName(s);
    }
    public static void checkUserName(String name){
        if (name.equals("")){
            System.out.println("用户名不能为空");
            return;
        }
        if (name.length()>20){
            System.out.println("用户名必须在20个字以内");
            return;
        }
        System.out.println(name);
    }
}
