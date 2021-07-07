package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Collection<Integer> newlist = new HashSet<>();

		while (true){
			list.add(new Random().nextInt(20));
			newlist.addAll(list);
			if (newlist.size()==10){
				break;
			}
		}


		System.out.println(list);
		System.out.println(newlist);
	}
}
