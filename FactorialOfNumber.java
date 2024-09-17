import java.util.*;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = i * fact;
        }
        System.out.println(fact);
    }
}
