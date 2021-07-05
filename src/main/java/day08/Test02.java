package day08;
/**
 * 修改下面代码的编译
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread() {
			public void run(){
				foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run(){
				foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}

class Foo{
	public static void dosome() {
		synchronized (Foo.class) {
			Thread t = Thread.currentThread();
			try {

				System.out.println(t+ ":hello!");
				System.out.println(t + ":正在hello!");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			System.out.println(t + ":hello结束!");
		}
	}
}

