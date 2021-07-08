package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈可以保存一组元素，但是存取元素必须遵循先进后出原则
 * 双端队列如果只调用从同一侧出队操作操作就形成了栈结构，因此双端队列
 * 也为栈结构提供了经典的方法：push和pop
 */

public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");

        System.out.println(stack);

        String str = stack.pop();
        System.out.println(str);
        System.out.println(stack);

        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println(stack);

        while (stack.size()>0){
            String s = stack.pop();
            System.out.println(s);
        }
        System.out.println(stack);



    }
}
