package thread;

/**
 * 线程的优先级
 * 线程分为10个优先级，分别用整数1-10表示，其中1为最低优先级，5为默认值，10为最高优先级。
 * 优先级越高的线程获取CPU时间片的次数越多。
 *
 * 线程start后就纳入到了线程调度器中统一管理，线程无权主动索取时间片，
 * 只能被动分配，因此可以通过调整线程的优先级来最大程度的改善获取时间片的几率。
 */

public class PriorityDemo {
    public static void main(String[] args) {
        Thread max = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };

        Thread min = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("min");
                }
            }
        };

        Thread norm = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("norm");
                }
            }
        };

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);

        min.start();
        norm.start();
        max.start();

    }
}
