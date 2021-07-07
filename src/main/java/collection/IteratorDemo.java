package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection提供了用于遍历集合的方法
 * Iterator iterator()
 * 该方法会返回一个用于遍历当前集合元素的迭代器
 *
 * java.util.Iterator接口
 * 该接口是迭代器接口,规定了迭代器遍历集合的对应操作,所有集合都实现了
 * 一个用于遍历自身元素的迭代器实现类.
 * 迭代器遍历集合遵循的步骤:问,取,删.其中删除元素不是必要操作
 */

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("one");
        c.add("two");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        Iterator it = c.iterator();

        /**
         * boolean hasNext()
         * 通过迭代器判断集合是否还有"下一个"元素可供遍历.
         * 第一次调用时判断的就是集合第一个元素.
         *
         * E next()
         * 获取"下一个"元素,第一次调用就是获取第一个,第二次调用获取第二个,以此类推,调用前一定确定hasNext为true
         *
         * void remove()
         * 删除通过next方法获取的元素.
         */
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
            if ("#".equals(str)){
//                c.remove(str);
                it.remove();
            }
        }
        System.out.println(c);

    }
}
