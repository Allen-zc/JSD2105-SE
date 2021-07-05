package thread;

/**
 * 死锁
 * 死锁的产生：
 * 两个线程各自持有一个锁的同时等待对方先释放锁，这时会形成一种僵持的状态。
 * 这个现象就称为死锁。
 */

public class DeadLockDemo {
    //筷子
    public static Object chopsticks = new Object();
    //勺子
    public static Object spoon = new Object();

    public static void main(String[] args) {
        //北方人
        Thread np = new Thread(){
            public void run(){
                System.out.println("北方人开始吃饭");
                System.out.println("北方人去拿筷子");
                synchronized (chopsticks){
                    System.out.println("北方人拿起了筷子吃饭...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("北方人吃完了饭，去拿勺");
                    synchronized (spoon){
                        System.out.println("b北方人拿起了勺喝汤...");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        }
                        System.out.println("北方人喝完了汤");
                    }
                    System.out.println("北方人放下了勺");
                }
                System.out.println("北方人放下了筷子");
            }
        };

        Thread sp = new Thread(){
            public void run(){
                System.out.println("南方人开始吃饭");
                System.out.println("南方人去拿勺");
                synchronized (spoon){
                    System.out.println("南方人拿起了勺喝汤...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("南方人喝完了汤，去拿筷子");
                    synchronized (chopsticks){
                        System.out.println("南方人拿起了筷子吃饭...");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                        }
                        System.out.println("南方人吃完了饭");
                    }
                    System.out.println("南方人放下了筷子");
                }
                System.out.println("南方人放下了勺");
            }
        };

        np.start();
        sp.start();

    }
}
