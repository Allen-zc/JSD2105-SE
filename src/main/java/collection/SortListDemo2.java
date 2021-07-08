package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素
 */

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,5));
        list.add(new Point(9,8));
        list.add(new Point(13,15));
        list.add(new Point(5,1));
        list.add(new Point(2,3));
        list.add(new Point(1,1));

        System.out.println(list);

        /**
         * Collections.sort(List list)
         * 该方法在排序集合时要求集合元素类型必须实现接口：Comparable
         * 该接口定义了一个抽象方法：compareTo，用来实现实例之间的比较大小规则。
         * 因此只有实现了这个接口的元素才可以比较大小从而进行排序。
         *
         * 实际开发中如果我们发现sort方法排序List集合时出现上述问题。
         * 不要让元素实现该接口，因为这个操作具有侵入性！
         * 侵入性：当我们用一个API时，调用该方法时其要求我们为其修改
         * 其他额外代码，这个行为就是侵入性，侵入性不利于程序的后期维护应当尽量避免。
         * spring
         */

//        Collections.sort(list);

        /**
         * Comparator接口是比较器接口，其中定义了抽象方法compara用于定义
         * 两个元素的比较规则，该方法的返回值要遵循的原则为：
         * 当返回值>0,表示o1>o2
         * 当返回值<0,表示o1<o2
         * 当返回值=0,表示o1=o2
         */

        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
               int len1 = o1.getX()* o1.getX()+o1.getY()*o1.getY();
               int len2 = o2.getX()* o2.getX()+o2.getY()*o2.getY();
               return len1-len2;
            }
        });

        System.out.println(list);
    }
}
