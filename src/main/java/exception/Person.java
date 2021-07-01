package exception;

/**
 * 测试异常的抛出
 */

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0||age>100){

            /**
             * 当一个方法中使用throw抛出某个异常时就应当在当前方法上使用throws声明该异常的抛出告知调用者，
             * 只有一个是例外的，就是抛出RuntimeException这类异常，否则剩下的都是强制的。
             */

//            throw new RuntimeException("年龄不合法");
//            throw new Exception("年龄不合法");
        }

        this.age = age;
    }

}
