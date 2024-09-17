import java.util.Scanner;

public class CostQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alert...!!! \n All the product have cost 100 ");
        System.out.println("Enter the Quantity of the product");
        int Q = sc.nextInt();
        int Total_cost = Q * 100;
        if (Total_cost > 1000) {
            System.out.println("Congratulation you get 10% discount and \n your's total bill is  ");
            System.out.println(Total_cost * 90 / 100);
        } else
            System.out.println("your's total bill is " + Total_cost);

    }
}
