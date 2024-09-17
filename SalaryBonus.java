import java.util.*;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary ");
        int sal = sc.nextInt();
        System.out.println("Enter your year of services");
        int ser = sc.nextInt();
        if (ser > 5) {
            int bonus = sal + sal * 5 / 100;
            System.out.println("congratulation your's total salary after adding bonus is " + bonus);
        } else
            System.out.println("you don't have any bonus so your salary is as it is  " + sal);

    }
}
