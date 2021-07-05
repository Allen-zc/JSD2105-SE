package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于线程切换时间不确定，导致操作该资源过的过程执行顺序混乱，从而出现错误。
 * 临界资源：操作该资源的完整过程同时只能被单个线程进行。
 */

public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();

        Thread t1 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                while (true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName() + ":" + bean);
                }
            }
        };

        t1.start();
        t2.start();

    }
}
class Table{
    //桌子上有20个豆子
    private int beans = 20;

    /**
     * 当一个方法使用关键字synchronized修饰后，该方法称为“同步方法”
     * 此时这个方法不能同时被多个线程执行。
     * 将多个线程并发操作的过程改为同步有先后顺序的执行可以有效的解决
     * 多线程的并发安全问题。
     */

    public synchronized int getBean(){
        if (beans == 0){
            throw new RuntimeException("没有豆子了!");
        }
        //主动在这里放弃CPU时间片，模拟线程执行到这里没有时间了
        Thread.yield();

        return beans--;

    }
}
