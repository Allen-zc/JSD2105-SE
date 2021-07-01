package exception;

/**
 * finally块
 * finally是异常处理机制的最后一块，它可以直接跟在try块后或者最后一个catch块之后，
 * finally可以保证只要程序执行到try语句块中，无论try中的代码是否出现了异常，
 * finally都必定执行，所以通常我们将释放资源这类操作放在finally中，比如IO操作后的关闭。
 *
 */

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。");

        try{
//            String str =null;
            String str ="";
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("出错误了！");

        }finally {
            System.out.println("finally中代码执行中！");
        }

        System.out.println("程序结束了。。。");
    }
}
