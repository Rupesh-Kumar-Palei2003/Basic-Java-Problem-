import java.util.*;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // Outer Loop --> rows
        for (int i = 1; i <= n; i++) {
            // Inner Loop --> space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner Loop 2 --> star mama goji
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
