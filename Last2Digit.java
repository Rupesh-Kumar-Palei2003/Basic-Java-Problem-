import java.util.*;
import java.math.BigInteger;

public class Last2Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        BigInteger num = new BigInteger(sc.next());
        System.out.println("Enter power");
        BigInteger power = new BigInteger(sc.next());
        BigInteger calculate = num.pow(power.intValue());

        System.out.println(calculate);

        String resultStr = calculate.toString();
        int len = resultStr.length();

        if (len >= 2) {
            System.out.println("Last 2 digits are: " + resultStr.substring(len - 2, len));
        } else {
            System.out.println("The result is too small to have 2 digits.");
        }
    }
}
