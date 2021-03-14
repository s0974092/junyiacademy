import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String output = "";
        ReverseString reverseString = new ReverseString();

        if (args.length == 1) {
            output = reverseString.reverse(args[0]);
            System.out.println("output is = " + output);
        } else if (args.length > 1) {
            int argLength = args.length;
            for(int i = 0; i < argLength; i++) {
                output += reverseString.reverse(args[i]);
                output += ' ';
            }
            System.out.println("output is = " + output);
        } else {
            System.out.println("請輸入參數！");
        }
    }

    String reverse(String words) {
        String result = "";
        for (int i = words.length() - 1; i >= 0; i--){  
            char c = words.charAt(i);
            result += c;
        }
        return result;
    }

}