package exception;


/**
 * throw关键字，用来让我们可以主动对外抛出一个异常，通常下列情况我们会主动对外抛出异常：
 * 1.当前代码片段执行时出现了一个异常，但是该异常不应当被当前代码片段解决时
 * 可以将其抛出给调用者处理，这要结合实际业务中的责任问题来分析。
 * 2.程序遇到一个满足语法但是不满足业务要求的操作时，可以主动对外抛出一个异常告知这样的操作是错误的。
 */

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了!");
        Person p = new Person();
        //满足语法（程序可以运行，但是不满足业务要求（不符合人类年龄）
        try {

            /**
             * 当我们调用一个含有throws声明异常抛出的方法时，编辑器要求我们必须处理这个异常，否则编译不通过。
             * 处理方式有两种：
             * 1.使用try-catch捕获并处理
             * 2.在当前方法上继续是同throws声明该异常的抛出
             * 具体选择哪种处理方式取决于异常解决的责任问题。
             */

            p.setAge(10000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄：" + p.getAge());

        System.out.println("程序开始了!");


    }
}
