package thread;

/**
 * java中所有的代码都是线程运行的，main方法也不例外，运行main方法的线程
 * 是java进程创建的，并且该线程的名字叫做“main”，一般我们称它为“主线程”
 * 我们自己创建的线程如果没有特别指定名字时，默认名字的格式为：Thread-x
 * x是一个数字，从0开始
 *
 *
 */

public class CurrentThreadDemo {
    public static void main(String[] args) {

        /**
         * Thread提供的静态方法：
         * static Thread currentThread()
         * 该方法可以获取运行这个方法的线程
         */

        Thread main = Thread.currentThread();

     //让主线程创建一条线程与它一起并发
        Thread T = new Thread(){
          public void run(){
              Thread t = Thread.currentThread();
              System.out.println("自定义线程：" + t);
              dosome();
              System.out.println("自定义线程结束了！");
          }
        };

        T.start();

        System.out.println("主线程:" + main);


        dosome();
        System.out.println("主线程结束了！");

    }

    public static void dosome(){
        //获取运行dosome方法的线程
        Thread t = Thread.currentThread();
        for (int i = 0; i < 1000; i++) {
            System.out.println(t + "正在执行dosome方法" + i);
        }
    }

}
