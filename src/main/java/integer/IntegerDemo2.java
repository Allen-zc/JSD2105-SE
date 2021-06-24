package integer;

/**
 * 包装类常见的一些功能
 */

public class IntegerDemo2 {
    public static void main(String[] args) {

        /**
         * 数字类型的包装类支持两个常量：MAX_VALUE和MIN_VALUE
         * 用于表示对应的基本类型的取值范围
         */
        System.out.println("----------------------------------");
        int imax = Integer.MAX_VALUE;
        System.out.println(imax);
        int imin = Integer.MIN_VALUE;
        System.out.println(imin);

        System.out.println("----------------------------------");

        long lmax = Long.MAX_VALUE;
        System.out.println(lmax);
        long lmin = Long.MIN_VALUE;
        System.out.println(lmin);

        System.out.println("----------------------------------");

        double dmax = Double.MAX_VALUE;
        System.out.println(dmax);
        double dmin = Double.MIN_VALUE;
        System.out.println(dmin);

        System.out.println("----------------------------------");

        int maxExponent = Double.MAX_EXPONENT;
        System.out.println(maxExponent);
        int minExponent = Double.MIN_EXPONENT;
        System.out.println(minExponent);

        System.out.println("----------------------------------");

        int maxRadix = Character.MAX_VALUE;
        System.out.println(maxRadix);
        int minRadix = Character.MIN_VALUE;
        System.out.println(minRadix);

        /**
         * 包装类提供了静态方法：parseXXX(String str)
         * 作用是将字符串解析为对应的基本类型，前提是该字符串正确表示了基本类型
         * 可以保存的值，否则会抛出异常：NuberForMatException
         */

        String line = "123";
        int d = Integer.parseInt(line);
        System.out.println(d);

        String line2 = "123.123";
        double d2 = Double.parseDouble(line2);
        System.out.println(d2);

        //这种不可以
//        String line1 = "123.123";
//        int d1 = Integer.parseInt(line1);
//        System.out.println(d1);

    }
}
