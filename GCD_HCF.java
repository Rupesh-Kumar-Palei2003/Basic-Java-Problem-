import java.util.*;

public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int temp1 = 0;
        int temp2 = 1;
        for (int i = n2; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                temp1 = i;
                break;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + temp1);
        for (int j = 1; j <= n2; j++) {
            if (n1 % j == 0 && n2 % j == 0) {
                temp2 = temp2 * j;

            }
        }
        System.out.println("HCF of " + n1 + " and " + n2 + " is " + temp2);
    }
}
