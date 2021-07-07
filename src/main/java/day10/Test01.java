package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 改错题
 * 
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(new Random().nextInt(10) + 1);
		}

		System.out.println(list);

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer next = it.next();
			System.out.println(next);
		}
	}
}





