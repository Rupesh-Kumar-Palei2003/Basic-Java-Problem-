import java.util.*;

public class PowerOfNumber {
    static int powerNumber(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * powerNumber(num, power - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("enter the power ");
        int power = sc.nextInt();
        System.out.println(num + "to the power " + power + " is " + powerNumber(num, power));

    }
}
