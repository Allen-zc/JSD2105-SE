package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合中与元素定义的方法相关的操作
 */

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));

        /**
         * 集合重写了toString方法，格式如下：
         * [元素1.toString(),元素2.toString(), ...]
         * 因此如果集合中存放的是自定义的元素，那么为了有更好的输出集合效果，
         * 元素应当重写toString方法。
         */
        System.out.println(c);

        Point p = new Point(1, 2);
        System.out.println("p:" + p);

        /**
         * boolean contains(Object o)
         * 判断当前集合是否包含给定元素，判断的依据是给定的元素是否与
         * 集合中存放的元素存在equals比较为true的，存在则认为包含。
         */
        boolean contains = c.contains(p);
        System.out.println("包含：" + contains);

        /**
         * boolean remove(Object o)
         * 删除当前集合中与给定元素equals比较为true的元素，成功删除
         * 则返回true。
         *
         * 对于List集合而言，如果存在重复元素，则仅删除一次。
         */
        c.remove(p);
        System.out.println(c);

    }
}
