import java.util.*;

public class LeapYearChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year number");
        int year = sc.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " year is leap year");
            } else
                System.out.println(year + " not leap year");
        }

    }
}
