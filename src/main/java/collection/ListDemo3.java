package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start, int end)
 * 获取当前集合中之哦顶范围内的子集
 */

public class ListDemo3 {
    public static void main(String[] args) {
        /**
         * 如果泛型指定需要是基本类型时,要指定对应的包装类,泛型只能
         * 是引用类型.
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        //获取子集 2-7
        List<Integer> subList = list.subList(2, 8);
        System.out.println(subList);

        for (int i = 0; i < subList.size(); i++) {
            int num = subList.get(i);
            num = num * 10;
            subList.set(i,num);
        }

        /**
         * 当我们使用subList获取一个集合的子集后,对该子集的元素操作
         * 就是对原集合对应的操作!
         */
        //[20,30,40,50,60,70]
        System.out.println(subList);
        System.out.println(list);

        /**
         * 将集合中2-8删除
         */
        list.subList(2,9).clear();
        System.out.println(list);

    }
}
