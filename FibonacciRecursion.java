import java.util.*;

public class FibonacciRecursion {
    public static void calFibonacci(int third, int first, int sec, int num) {
        if (third == num) return;
        third = first + sec;
        System.out.print("," + third);
        calFibonacci(third, sec, third, num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int first = 0;
        int sec = 1;
        System.out.print(first + "," + sec);
        calFibonacci(0, 0, 1, num);

    }
}
