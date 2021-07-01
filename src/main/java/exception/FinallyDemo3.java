package exception;

/**
 * finally常见面试问题
 *
 * 请分别说明final,finalize,finally?
 * finalize是Object中定义的方法，该方法被GC调用，当GC即将释放一个对象
 * 时会调用该方法，调用后该对象被释放，因此该方法是一个对象生命周期中的最
 * 后一个方法。
 *
 *
 */

public class FinallyDemo3 {
    public static void main(String[] args) {

        System.out.println(test("0") +","+ test(null) +","+ test(""));

    }
    public static int test(String str){
        try {
            return str.charAt(0) - '0';
        }catch (NullPointerException e){
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
