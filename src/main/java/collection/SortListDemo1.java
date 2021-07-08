package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序List集合
 * java.util.Collections是集合的工具类,里面提供了很多静态方法帮助我们
 * 操作集合,其中sort方法可以对List集合进行自然排序(从小到大)
 */

public class SortListDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);
//        Collections.sort(list);

        Collections.sort(list,(n1,n2)->n2-n1);
        System.out.println(list);
    }
}
