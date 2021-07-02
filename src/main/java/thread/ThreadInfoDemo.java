package thread;

/**
 * 获取线程相关信息的一组方法
 */

public class ThreadInfoDemo {
    public static void main(String[] args) {
        //获取主线程
        Thread main = Thread.currentThread();

        String name = main.getName();

        System.out.println(name);

        long id = main.getId(); //获取唯一标识
        System.out.println(id);

        boolean isAlive = main.isAlive();   //判断是否活着
        boolean isDaemon = main.isDaemon(); //相乘是否为守护线程
        boolean isInterrupted = main.isInterrupted();//线程是否被中断

        System.out.println("isAlive:" + isAlive);
        System.out.println("isDaemon:" + isDaemon);
        System.out.println("isInterrupted:" + isInterrupted);

        int priority = main.getPriority();  //获取线程的优先级
        System.out.println("优先级：" + priority);

    }
}
