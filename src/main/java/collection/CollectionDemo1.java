package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java集合框架
 * java.util.Collection接口，所有集合的顶级接口，里面规定了集合所必须具备的相关功能。
 * 集合与数组一样，可以保存一组元素，并且对于元素的操作都封装成了方法。
 *
 * 集合有多种实现类，实现了不同的数据结构，实际开发中我们可以结合实际需求
 * 选取合适的数据结构来存储元素。
 *
 * Collection下面有两个常见的子接口：
 * java.util.List:线性表，特点：可以存放重读元素，并且有序。
 * java.util.Set:不可重复集。即：不能存放重复元素。
 * 元素是否重复是依靠自身的equals比较来判定的，即：Set集合不能存在
 * 两个元素equals比较为true的情况。
 *
 */

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        /**
         * boolean add(E e)
         * 将给定元素添加到集合中，如果成功添加则返回true
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        System.out.println(c);

        /**
         * int size()
         * 返回当前集合的元素个数
         */
        int size = c.size();
        System.out.println("size:" + size);

        /**
         * boolean isEmpty()
         * 判断当前集合是否为空集（不含有元素）。
         * 当集合的size为0时，返回true。
         */
        boolean isEmpty = c.isEmpty();
        System.out.println("是否为空集：" + isEmpty);

        //清空集合
        c.clear();
        System.out.println(c);
        System.out.println("size:" + c.size());
        System.out.println("是否为空集：" + c.isEmpty());
    }
}
