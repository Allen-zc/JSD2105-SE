package thread;

/**
 * 静态方法上如果使用synchronized，那么该方法一定具有同步效果。
 */

public class SyncDemo3 {
    public static void main(String[] args) {
//        Boo b1 = new Boo();
//        Boo b2 = new Boo();

        Thread t1 = new Thread(){
            public void run(){
                Boo.dosome();
//                b1.dosome();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
//                b2.dosome();
            }
        };
        t1.start();
        t2.start();

    }
}

class Boo{

    /**
     * 静态方法上使用synchronized时，同步监视器对象为当前类的类对象
     * 即：Class的实例。
     * JVM中每个被加载的类都有且只有一个类对象与之对应，静态方法上指定的
     * 锁对象就是这个类对象，后期会学习java反射机制，在哪里会介绍。
     * 指定类对象作为同步监视器对象时的写法为：类名.class
     */

//    public synchronized static void dosome(){
    public static void dosome() {
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "：正在执行dosome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println(t.getName() + "：执行dosome方法完毕！");
        }
    }
}