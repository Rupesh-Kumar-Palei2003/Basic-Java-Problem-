import java.util.Scanner;

public class CountDown {
    public static int countNumber(int n) {
        if (n == 0) return 0;
        System.out.print(" " + n + " ");
        return countNumber(n - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.print(countNumber(num));
    }
}
