package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5推出时,退出了一个新的特性:增强型for循环,也称为新循环.
 * 它使得我们可以使用相同的语法遍历集合或数组
 * 语法:
 * for(元素类型 变量名 : 集合|数组){
 *
 * }
 */

public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println(s);
        }

        for (String str : array) {
            System.out.println(str);
        }

        /**
         * JDK5推出时推出的另一个特性:泛型.
         * 泛型也称为参数化类型,它允许我们在使用一个类时,指定该类中
         * 方法参数的类型或方法方法返回值的类型或属性的类型等.使得我们
         * 使用这个类时更加灵活方便.
         * 泛型被广泛的应用在集合中,用来约束集合中的元素类型,对于有
         * 泛型的类在使用时如果不指定泛型的实际类型,则默认为原型Object
         */
        Collection<String> c = new ArrayList<String>(); //后面的String可加可不加
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
//        c.add(123); //编译不通过,编译器会检查传递给泛型参数的实际类型
        System.out.println(c);

//      迭代器也可以指定泛型,告知迭代器遍历集合的元素类型
        Iterator<String> it = c.iterator(); //泛型要与集合指定的一致
        while (it.hasNext()){
            //E next() :该方法返回时以泛型指定的类型返回,因此无需再造型
            String str = it.next();
            System.out.println(str);
        }

        //新循环就是迭代器,编译后会改为上面的迭代器遍历方式
//        for (Object o : c) {
//            String str = (String) o;
//            System.out.println(str);
//        }

        for (String str : c) {    //集合指定泛型后,可直接用元素实际类型输出
            System.out.println(str);
        }
    }
}
