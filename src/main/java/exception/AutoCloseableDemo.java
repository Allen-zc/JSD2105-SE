package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后退出了一个新的特性：AutoCloseable
 * 使得我们可以用更精简的语法在异常处理机制中完成IO操作
 */

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (
                /**
                 * 只有实现了Autocloseable接口的类才能在这里声明变量，并且最终会被
                 * 编译器改为在finally中将其关闭。
                 */

                FileOutputStream fos = new FileOutputStream("fos.dat")
        ){

            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
