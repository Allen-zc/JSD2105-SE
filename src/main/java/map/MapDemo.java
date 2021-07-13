package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 接口,查找表
 * Map体现的结构是一个多行两列的表格，其中左列称为key,右列称为value。
 * Map总是根据key获取value,并且要求key不允许重复。
 *
 * java.util.HashMap: 最常用的Map实现类，称为散列表或哈希表，是当今查询
 * 速度最快的数据结构，使用散列算法实现的Map。
 *
 */

public class MapDemo {
    public static void main(String[] args) {

        /**
         * Map的泛型需要指定两个，分别对key和value指定类型
         */

        Map<String,Integer> map = new HashMap<>();

        /**
         * V put(K k,V v)
         * 将给定的一组键值对存入到Map中，由于Map中的key不允许重复
         * 如果给定的key不重复则存入后返回值为null
         * 如果给定的key是不重复的，则是替换value操作，将新的value存入
         * 后返回的是这个key原来对应的value。
         * key是否重复是依靠key自身的equals方法比较的结果。
         */

        Integer value = map.put("语文", 99);
        System.out.println("value: " + value);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",95);
        map.put("生物",94);
        map.put("地理",96);
        map.put("历史",92);
        map.put("政治",99);

        System.out.println(map);

        //替换value
        value = map.put("英语", 66);
        System.out.println(map);
        System.out.println("value:" + value);

        /**
         * V get(K k)
         * 根据给定的key获取对应的value,如果给定的key在Map中不存在
         * 则返回值为null。
         */
        value = map.get("数学");
        System.out.println("数学：" + value);
        value = map.get("体育");
        System.out.println("体育：" + value);

        int size = map.size();
        System.out.println("size: " + size);

        boolean empty = map.isEmpty();
        System.out.println("是否为空：" + empty);

//        map.clear();
//        System.out.println("是否为空：" + map.isEmpty());

        value = map.remove("物理");
        System.out.println(map);
        System.out.println("value: " + value);

        /**
         * boolean containsKey(K k)
         * 判断当前Map是否包含给定的key
         * boolean containsValue(V v)
         * 判断当前Map是否包含给定的value
         */
        boolean ck = map.containsKey("语文");
        System.out.println("包含key: " + ck);

        boolean cv = map.containsValue(99);
        System.out.println("包含value: " + cv);
    }
}
