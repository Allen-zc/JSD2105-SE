package socket;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int pw = 25;
        int [] allOut = {1,5,7,2,87,123,656,35,25,11,333};
        System.out.println(Arrays.toString(allOut));
        for (int i = 0; i < allOut.length; i++) {
            if (allOut[i] == pw){
                allOut[i] =allOut[allOut.length-1];
                allOut = Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }
        System.out.println(Arrays.toString(allOut));
    }
}
