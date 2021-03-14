import java.util.*;

public class NumberCount {

    public static void main(String[] args) {
        int output = 0;
        if (args.length == 1) {
            int number = Integer.parseInt(args[0]);
            for (int index = 1; index <= number; index++) {
                if ((index%3) != 0 && (index%5) != 0 && (index%15) != 0) {
                    output++;
                } else if((index%15) == 0) {
                    output++;
                }
            }
            System.out.println("output is = " + output);
        } else {
            System.out.println("請輸入一組數字！");
        }
    }

}