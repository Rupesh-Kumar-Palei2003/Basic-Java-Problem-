/*
Take integer inputs from user until he/she presses q.
( Ask to press q to quit after every integer input ).
 Print average and product of all numbers.
 */

import java.util.*;

public class AverageQuite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        float total_sum = 0;
        int total_mul = 1;
        while (true) {
            System.out.println("enter a number");
            int n = sc.nextInt();
            count++;
            total_sum = total_sum + n;
            total_mul = total_mul * n;
            System.out.println("for quite press Q else press N");
            char ch = sc.next().charAt(0);
            if (ch == 'N') {
                continue;
            } else
                break;
        }
        System.out.println("average of all number is" + total_sum / count);
        System.out.println("multiplication of all number is " + total_mul);

    }
}
