package thread;

/**
 * 多线程
 * 多线程可以并发执行多个代码片段，使得代码有机会“同时行驶”。
 *
 * 线程的创建有两种方式：
 * 1.继承Thread并重写run方法
 *
 */

public class ThreadDemo1 {
    public static void main(String[] args) {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        /**
         * 启动线程要调用start方法，而不是直接调用run方法。
         * 当start方法调用后线程会纳入到线程调度器中，一旦
         * 获取到了时间片，run方法会自动被执行。
         */

        myThread1.start();
        myThread2.start();
    }
}

/**
 * 第一种创建线程的方式的优点在于：结构简单，利于匿名内部类的创建。
 * 缺点有两个：
 * 1.继承Thread，由于java是单继承的，这导致如果继承了Thread就无法再继承其他类来复用代码，实际开发中是很不方便的。
 * 2.定义线程的同时重用了run方法来定义线程要执行的任务，这导致线程与线程要执行的任务存在着必然的绑定关系，不利于线程的重用。
 */

class MyThread1 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("你是谁啊？");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("开门，查水表的");
        }
    }
}