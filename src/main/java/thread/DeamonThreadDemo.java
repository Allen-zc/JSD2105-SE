package thread;

/**
 * 守护线程
 * 也称为后台线程，它是通过普通线程调用setDeamon(true)设置而来的。
 * 因此创建时与普通线程无异，但是再结束时机上有一点不同：线程结束时。
 *
 * 线程的结束：
 * 当一个java进程中的所有普通线程都结束时，进程就会结束，此时它会
 * 强制杀死所有还在运行的守护线程。
 *
 * GC就是在守护线程上执行的。
 * 当我们运行的某个任务不关心它什么时候结束，只要我们主要的任务还在执行
 * 完毕慧后他们可以跟着结束，那么这类任务就是和放在守护线程上执行。
 */

public class DeamonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("rose:let me go！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                    System.out.println("rose:aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    System.out.println("噗通！");
                }
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while (true){
                    System.out.println("jack:You jump! i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        };

        rose.start();

        /**
         * 设置守护线程的工作必须在线程启动前进行，否则会抛出异常。
         */
        jack.setDaemon(true);
        jack.start();

        /**
         * 如果主线程还活着，那么此时rose结束时，由于进程发现还有
         * 普通线程活着（主线程海活着）就不会结束，因此就不会杀死所有
         * 还在运行的守护线程。
         */
        while (true);
//        System.out.println("main方法走完了！");
    }

}
