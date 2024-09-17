/*
Calculate the sum of digits of a number given by user. E.g.-
INPUT : 123        OUTPUT : 6
INPUT : 12345        OUTPUT : 15
 */

import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0, sum = 0;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            sum = rem + sum;

        }
        System.out.println("sum of all digit is = " + sum);

    }
}
