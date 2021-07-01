package exception;

/**
 * 异常处理机制中的try-catch
 * 语法：
 * try{
 *     可能出现错误的代码片段
 * }catch(XXXException e){
 *     捕获try中出现的XXXException后的处理代码
 * }
 *
 */

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。");

        try {
//            String str = null;
//            String str = "a";
            String str = "abc";
            /**
             * 当JVM执行程序的过程中出现了某个异常时，就会实例化对应的异常，
             * 并将执行过程设置其中，然后将该异常抛出。
             */

            System.out.println(str.length());

//            System.out.println(str.charAt(1));

            System.out.println(Integer.parseInt(str));

            /**
             * try语句块中出错代码以下的内容都不执行！
             */

            System.out.println("!!!!!!!!!!!!!!");
        }catch (NullPointerException e){
            System.out.println("出现了空指针，并且解决了！");

            //catch可以定义多个，针对不同异常有不同处理方式时，可以分别捕获
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了下标越界，并且处理了！");

        }catch (NumberFormatException e){
            System.out.println("出现了数字格式异常，并且已经处理了！");

            //可以在最后一个catch处捕获Exception防止因未捕获的异常导致程序中断
        }catch (Exception e){
            System.out.println("出现了未知的错误！");
        }


        System.out.println("程序结束了！");
    }
}
