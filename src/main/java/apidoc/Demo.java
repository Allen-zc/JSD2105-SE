package apidoc;

/**
 * 文档注释只有三个地方使用，分别是类上，方法上和常量上。
 * 在类上使用时用来说明当前类的设计意图，功能等介绍。
 * The <code>String<code/>calss represents character strings
 * @author Allen
 * @version 1.0,2021/6/23
 * @see java.lang.StringBuffer
 * @since JDK1.8.1
 *
 */

public class Demo {
    /**
     * 问候句：你好
     */
    public static final String INFO = "你好";

    /**
     * 为给定的用户添加问候语
     * @param name  给定的用户名
     * @return  返回的是一个字符串，内容为：问候用语+name
     */
    public String sayHello(String name){
        return INFO+name;
    }

}
