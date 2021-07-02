package thread;

import java.util.Scanner;

/**
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒，
 * 超时后线程会自动回到RUNNABLE状态再次开始并发运行
 */

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        System.out.print("请输入数字：");
        int num = new Scanner(System.in).nextInt();
        /**
         * 倒计时程序，程序启动后要求输入一个数字，然后从该数字开始每秒
         * 递减并输出，倒0时输入时间到
         */
        System.out.println("计时开始！！！！");
        System.out.println(num);

            try {
                for (int i = num-1; i >= 0 ; i--) {
                    Thread.sleep(1000);
                    if (i == 0) {
                        System.out.println("时间到！🎛");
                        return;
                    }
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("程序结束了");


    }
}
