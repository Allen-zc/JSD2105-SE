package thread;

/**
 * 使用匿名内部类完成线程的两种创建
 */

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("hallo姐姐~");
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("来了老弟!");
                }
            }
        };


        //Runnable可以使用lambda表达式创建，因为方法中有 @FunctionalInterface
        Runnable r3 = ()->{
                for (int i = 0; i < 1000; i++) {
                    System.out.println("来了老弟!");
                }

        };

        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();


    }
}
