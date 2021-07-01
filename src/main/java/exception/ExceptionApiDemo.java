package exception;

/**
 * 异常中常见的方法
 */

public class ExceptionApiDemo {
    public static void main(String[] args) {
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            System.out.println("异常处理了");

            /**
             * 将异常的信息输出到控制台
             */

            e.printStackTrace();

            /**
             * 获取错误消息，常用于记录日志或者提示给用户使用
             */

            String message = e.getMessage();
            System.out.println("message:" + message);

        }
    }
}
