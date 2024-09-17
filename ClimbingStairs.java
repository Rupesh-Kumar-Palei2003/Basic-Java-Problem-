import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        int first = 0, second = 1, third = 0;
        for (int i = 0; i < num; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        System.out.println("number of stairs: "+third);
    }
}
