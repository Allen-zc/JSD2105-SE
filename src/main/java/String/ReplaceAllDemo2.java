package String;

/**
 * 和谐用语
 */

public class ReplaceAllDemo2 {
    public static void main(String[] args) {
        String regex = "(wqnmlgb|nmb|cnm|nc|djb|dsb|wrsndm|nmsl)";
        String message = "wqnmlgb!你个nc，你会不会玩！wrsndm，你就是个djb!";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
        /**
        * 输出结果为：***!你个***，你会不会玩！***，你就是个***!
        */
    }
}
