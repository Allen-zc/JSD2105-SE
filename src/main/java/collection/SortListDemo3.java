package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        list.add("Allen");
        list.add("曾");
        list.add("小泽又沐风");

        System.out.println(list);

//        Collections.sort(list);

//        Collections.sort(list,(o1,o2)->o1.length()-o2.length());

        Collections.sort(list,(o1,o2)->o2.length()-o1.length());


        System.out.println(list);
    }
}
