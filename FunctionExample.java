import java.util.*;

public class FunctionExample {
    public static int addTwoNumber(int x, int y) {
        return x + y;
    }

    public static int multipleTwoNumber(int x, int y) {
        return x * y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("sum of " + x + " & " + y + " is " + addTwoNumber(x, y));
        System.out.println("multiplication of " + x + " & " + y + " is " + multipleTwoNumber(x, y));
    }
}
