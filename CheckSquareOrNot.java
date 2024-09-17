import java.util.*;

public class CheckSquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        if (l == b) {
            System.out.println("This is Square");

        } else {
            System.out.println("This is rectangle");
        }
    }
}
