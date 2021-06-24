package integer;

/**
 * 包装类
 * java中有8个基本类型，由于他们不是Object的子类，也不是以"对象"形式存在，
 * 因此没有面向对象的所有特征，实际开发中不能直接参与面向对象的开发，十分不便。
 * 因此java为8个基本类型提供了8个包装类，使得基本类型可以直接以"对象"形式表示。
 */

public class IntergerDemo {
    public static void main(String[] args) {
        //基本类型与对应的包装类之间的转换
        //基本类型->包装类     使用包装类的静态方法：valueOf
        Integer i1 = Integer.valueOf(123);
        Integer i2 = Integer.valueOf(123);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = new Integer(123);
        Integer i4 = new Integer(123);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        //包装类->基本类型
        int d = i1.intValue();
        System.out.println(d);
        long l = i1.longValue();
        System.out.println(l);
        double dou  = i1.doubleValue();
        System.out.println(dou);

    }

}
