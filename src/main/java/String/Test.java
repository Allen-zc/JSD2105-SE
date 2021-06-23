package String;

/**
 * 随堂联系
 * 实现方法，截取域名
 */

public class Test {
    public static void main(String[] args) {
        String n1 = getName("www.tedu.cn");
        String n2 = getName("http://doc.canglaoshi.org");
        String n3 = getName("www.tarena.com.cn");
        System.out.println(n1); //tedu
        System.out.println(n2); //canglaoshi
        System.out.println(n3); //tarena
    }

    public static String getName(String line){
        int firstindex = line.indexOf("."); //获取第一个“.”的下标
        int secondindex = line.indexOf(".", line.indexOf(".")+1);   //获取第一个“.”下标开始之后出现第二个“.”的下标
        String str = line.substring(firstindex + 1, secondindex);   //获取第一个“.”的位置+1到第二个“.”中的内容（含头不含尾）赋值给str
        return str; //返回字符串
    }
}
