import java.util.*;

public class FactorialRecursion {
    public static int factNumber(int num) {
        if (num == 0) return 1;
        return num * factNumber(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("factorial of " + num + " is " + factNumber(num));

    }
}
