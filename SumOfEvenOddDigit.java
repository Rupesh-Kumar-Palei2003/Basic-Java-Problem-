/*
Write a program in java to find
 the sum of the even and odd digits of the number which is given as input.
 */

import java.util.*;

public class SumOfEvenOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int rem;
        int odd = 0, even = 0;
        while (n != 0) {
            rem = n % 10;
            if (rem % 2 == 0) {
                even = even + rem;
            } else {
                odd = odd + rem;
            }
            n = n / 10;

        }
        System.out.println("Sum of even digit is " + even);
        System.out.println("Sum of odd digit is " + odd);
    }
}
