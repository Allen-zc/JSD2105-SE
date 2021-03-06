package homework.day02;
/**
 * 执行程序，分析并解决问题
 * 
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 * 
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 * 原因:"123 "有空格无法直接转为123，应该去除后面的空格在进行转换
		 */
		String num = "123 ";
		String trim = num.trim();
		int d = Integer.parseInt(trim);
		System.out.println(d);
		
		/*
		 * 原因:“123.456”为双精度浮点型，所有无法用Integer进行转换
		 */
		String num1 = "123.456";
		Double dou = Double.parseDouble(num1);
		System.out.println(dou);

		/*
		 * 原因:
		 */
//		num = "123";
//		d = Integer.parseInt(num);
//		System.out.println(d);
	}
}
