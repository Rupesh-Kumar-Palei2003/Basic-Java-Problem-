import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        // Outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop---->1st one side star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // this inner loop--->space
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // this loop --->2nd one side star
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower part
        // loop--> lower part left side star
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
