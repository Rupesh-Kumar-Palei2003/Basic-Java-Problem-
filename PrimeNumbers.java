/*
Write a program to print all prime number in between 1 and n.
 */

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("enter a range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = 1; num <= n; num++) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + n + " are :");
        System.out.println(primeNumbers);
    }
}
