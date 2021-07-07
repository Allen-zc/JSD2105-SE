package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个方法:toArray.可以将当前集合转换为一个数组
 */

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

//        Object[] array = c.toArray();

        /**
         * T[] toArray(T...array)
         * 该方法要求传入一个数组,如果该数组可用(长度>=size)则直接将
         * 当前集合所有元素存入该数组后将其返回.如果数组不可用(长度不足)
         * 则会根据传入的数组类型自动创建一个与集合size等长的数组并将
         * 集合元素存入后返回.
         */

        String[] strings = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(strings));
    }
}
