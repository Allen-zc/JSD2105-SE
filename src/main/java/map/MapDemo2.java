package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历.Map支持三种遍历方式:
 * 1.遍历所有的key
 * 2.遍历每组键值对
 * 3.遍历所有的value（相对不常用）
 */

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("语文",98);
        map.put("数学",99);
        map.put("英语",98);
        map.put("物理",98);
        map.put("化学",95);
        map.put("生物",94);
        map.put("地理",96);
        map.put("历史",92);
        map.put("政治",99);
        System.out.println(map);

        /**
         * 遍历所有的key
         * Set<k> keySet()
         * 将当前Map中所有的key以一个Set集合形式返回
         */
        Set<String> keySet = map.keySet();
        keySet.forEach(System.out::println);

        /**
         * 遍历每一组键值对
         * Set<Entry> entrySet()
         * 将当前Map中每一组键值对以一个Entry实例表示并最终以Set集合返回
         * java.util.Map.Entry 它的每一个实例表示Map中的一组键值对
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        entrySet.forEach(
                e->System.out.println(e.getKey() + ":" + e.getValue())
        );

        /**
         *  Map在JDK8之后也提供了forEach方法直接遍历每一组键值对
         */

        map.forEach((k,v)->System.out.println(k + ":" + v));

        /**
         * 遍历所有的value
         * Collection<V> values()
         * 将当前Map中所有的value以一个集合形式返回
         */

        Collection<Integer> values = map.values();

//        values.forEach(v->System.out.println(v));
        values.forEach(System.out::println);
    }
}
