package thread;

/**
 * 第二种创建线程的方式
 * 实现Runnable接口单独定义线程任务
 */

public class ThreadDemo2 {
    public static void main(String[] args) {

        MyRunnable1 myRunnable1 = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();

        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);

        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello姐~");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("来了老弟");
        }
    }
}