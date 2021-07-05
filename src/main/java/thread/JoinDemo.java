package thread;

/**
 * 线程定义的方法：
 * void join()
 * 该方法用来协调线程的同步运行。它允许一条线程在当前join方法所属的线程
 * 上等待（阻塞），直到join方法所属线程执行完毕后方可继续执行。
 *
 * 同步运行：多个线程执行时存在了先后顺序，有序进行。
 * 异步运行：多个线程各执行各的，互不干涉，多线程本身就是异步运行的。
 *
 */

public class JoinDemo {
    //标记图片是否下载完毕
    private static boolean isFinish = false;

    public static void main(String[] args) {

        /**
         * 当一个方法的局部内部类中需要引用这个方法的其他局部变量时，
         * 要求该变量必须被声明为final的。
         */
//        boolean isFinish = false;   //不能这么用
        Thread download = new Thread(){
            public void run(){
                System.out.println("down:开始下载图片。。。");
                for (int i = 1; i <= 100; i++) {
                    System.out.println("down:" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("down:图片下载完毕！");
                isFinish = true;
            }
        };

        Thread show = new Thread(){
            public void run(){

                System.out.println("show:开始显示文字。。。");
                try {
                    Thread.sleep(3000);

                } catch (InterruptedException e) {
                }
                System.out.println("show:显示文字完毕！");
                //将show线程阻塞，直到download执行完毕（将图片下载完毕）
                System.out.println("show:等待download下载图片。。。");
                try {
                    download.join();
                } catch (InterruptedException e) {
                }
                System.out.println("show:等待download完毕。。。");

                System.out.println("show:开始显示图片。。。");
                if (!isFinish){
                    throw new RuntimeException("图片显示失败！");
                }
                System.out.println("show:图片显示完毕！");
            }
        };


        download.start();
        show.start();
    }
}
