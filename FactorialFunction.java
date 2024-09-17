import java.util.*;

public class FactorialFunction {
    public static void factorialCalculate(int x) {
        if (x < 0) {
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for (int i = x; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + x + " is " + fact);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorialCalculate(n); // Function Call


    }
}
