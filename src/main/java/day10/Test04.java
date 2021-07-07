package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合元素翻转:第一个在最后一个，最后一个在第一个。
 * 以此类推，并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List.add(new Random().nextInt(101));
        }
        System.out.println(List);

        //方案一：
        Collections.reverse(List);
        System.out.println(List);

        //方案二：
        for (int i = 0; i < List.size() / 2; i++) {
            List.set(i,List.set(List.size()-1-i, List.get(i)));
        }
        System.out.println(List);
    }

}
