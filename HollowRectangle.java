import java.util.*;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows");
        int rows = sc.nextInt();
        System.out.println("Enter how many column");
        int cols = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1 || j == cols || i == 1 || i == rows) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
