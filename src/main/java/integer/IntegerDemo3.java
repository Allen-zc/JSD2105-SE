package integer;

/**
 * 自动拆装箱
 */

public class IntegerDemo3 {
    public static void main(String[] args) {

        /**
         *   写的时候是这样的
         */
        int d = new Integer(123);
        Integer i = 123;


        /**
         * 编译器编译为class文件之后是这样的
         */
        //触发了自动拆箱特性，代码会被修改为：int d = new Integer(123).intValue();
        int d1 = new Integer(123).intValue();
        //触发了自动拆箱特性，代码会被修改为：Integer i = Integer.valueOf(123);
        Integer i1 = Integer.valueOf(123);

    }
}
