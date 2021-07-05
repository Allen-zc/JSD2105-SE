package thread;

/**
 * 同步块
 * 语法：
 * synchronized(同步监视器对象){
 *     需要同步执行的代码片段
 * }
 *
 * 同步块可以更精准的锁定需要同步执行的代码片段，
 * 有效的缩小排队范围可以在保证并发安全的前提下提高并发效率。
 *
 */

public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
            }
        };

        t1.start();
        t2.start();

    }
}

class Shop{

    /**
     * 成员方法上直接使用synchronized时，同步监视器对象就是当前方法
     * 所属对象，即：方法内看到的this
     */

//    public synchronized void buy(){
    public void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "：正在挑衣服");
            Thread.sleep(5000);

            /**
             * 同步块在使用时要求指定同步吉监视器对象，该对象可以是
             * java中任何引用类型的实例，只要保证一点即可：多个需要
             * 同步执行该代码片段的线程看到的这个对象必须是同一个
             */
            synchronized (this){
//            synchronized (new Object()){
                System.out.println(t.getName() + "：正在试衣服");
                Thread.sleep(5000);
            }


            System.out.println(t.getName() + "：结账离开");

        } catch (InterruptedException e) {
        }

    }
}