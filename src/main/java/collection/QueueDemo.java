package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue接口。队列
 * Queue继承自Collection
 * 队列可以存储一组元素，但是存取元素必须遵顼先进先出原则：FIFO
 * First Input First Output
 * 常用实现类：LinkedList
 */

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        /**
         * boolean offer(E e)
         * 入队操作，将元素添加到队列末尾。
         */

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");

        System.out.println(queue);

        /**
         * E poll()
         * 出队操作，获取并删除队首元素。
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);

        /**
         * E peek()
         * 引用队首元素，获取队首元素后不做出队操作。
         */
        String str1 = queue.peek();
        System.out.println(str1);
        System.out.println(queue);

        /**
         * 由于队列是集合的实现类，因此可以使用迭代器（新循环）来遍历
         * 并且遍历不影响元素在队列中的存在。
         */
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue);

        //使用poll方法遍历（一次性的）
        System.out.println(queue.size());
    }
}
