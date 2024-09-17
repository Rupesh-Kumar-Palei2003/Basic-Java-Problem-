import java.util.*;

public class InvertedTrianglePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // Outer Loop-->rows
        for (int i = n; i >= 1; i--) {
            // Inner Loop-->space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner Loop -->star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

