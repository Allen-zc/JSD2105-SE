package homework.day05;

import java.io.*;

/**
 * 改正下面程序的错误
 * 
 * 程序实现的功能需求:复制一个文件
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fos = new FileInputStream("./text.txt");
		InputStreamReader isr = new InputStreamReader(fos);

		FileOutputStream fis = new FileOutputStream("./test_cp.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fis);


		int d;
		while((d = isr.read())!=-1) {
			osw.write(d);
		}
		System.out.println("复制完毕!");
		isr.close();
		osw.close();
	}
}




