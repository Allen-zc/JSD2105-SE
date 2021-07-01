package exception;

/**
 *
 * 非法的年龄异常
 *
 * 自定义异常，通常用来说明满足语法但是不满足业务场景的错误。
 * 自定义异常需要做到如下几点：
 * 1.异常类名要做到见名知义
 * 2.继承Exception，直接或间接继承均可。
 * 3.提供Exception所提供的所有种类构造方法。
 *
 */

public class IllegalAgeException extends Exception{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
