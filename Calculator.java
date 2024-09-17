import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = 0;
        System.out.println("Choose one operator for calculation (+,_,*,%,/)");
        char ope = sc.next().charAt(0);
        switch (ope) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            case '%':
                result = x % y;
                break;
            default:
                System.out.println("enter a valid operator");
        }
        System.out.println(result);
    }
}
