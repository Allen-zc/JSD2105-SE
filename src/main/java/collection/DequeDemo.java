package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列 java.util.Deque
 * Deque继承自Queue.
 * 双端队列是队列两端都可以做出入队操作的队列。
 * 常用实现类：LinkedList
 */

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        System.out.println(deque);

        //从队首方向入队
        deque.offerFirst("four");   //.offerFirst()
        System.out.println(deque);

        //从队尾方向入队
        deque.offerLast("five");    //.offerLast()
        System.out.println(deque);

        //队首方向出队
        String str = deque.poll();      //.poll()
        System.out.println(str);
        System.out.println(deque);

        //队首方向出队
        str = deque.pollFirst();        //.pollFirst()
        System.out.println(str);
        System.out.println(deque);

        //队尾方向出队
        str = deque.pollLast();         //.pollLast()
        System.out.println(str);
        System.out.println(deque);
    }
}
