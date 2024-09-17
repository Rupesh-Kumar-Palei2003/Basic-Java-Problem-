import java.util.*;

public class SumOfNumber {
    public static int sumNumber(int n) {
        if (n == 1) return 1;
        else return n + sumNumber(n - 1);

    }

    public static void sumNumber(int start, int end, int sum) {
        if (start == end) {
            sum = sum + start;
            System.out.println(sum);
            return;
        }
        sum += start;
        sumNumber(start + 1, end, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("sum of 1 to " + num + " is " + sumNumber(num));
        System.out.print("sum of 1 to " + num + " is  ");
        sumNumber(0, num, 0);
    }
}
