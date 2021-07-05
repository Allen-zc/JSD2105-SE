package thread;

/**
 * 当一个线程调用sleep方法进入阻塞的过程中，
 * 超时该线程的方法被调用时，该方法会抛出中断异常并打断阻塞状态。
 */

public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("刚美完容，睡一会吧。。。。");
                try {
                    Thread.sleep(100000000);
                } catch (InterruptedException e) {
                    System.out.println("林：干嘛呢！干嘛呢！干嘛呢！都破了相了");
                }
                System.out.println("林：醒了");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("大锤80，小锤40");
                for (int i = 0; i < 5; i++) {
                    System.out.println("80");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                }
                }
                System.out.println("咣当");
                System.out.println("黄：搞定");

                lin.interrupt();    //中断lin的睡眠阻塞！
            }
        };


        lin.start();
        huang.start();
    }
}
