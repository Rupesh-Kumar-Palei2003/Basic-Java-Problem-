/*
                 <---:HOMEWORK:--->
Make a function to check if a number is prime or not.
Make a function to check if a given number n is even or not.
Make a function to print the table of a given number n.
 */


import java.util.*;

public class FunctionHomeWork {
    //Checking prime number or not
    public static void primeCheck(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(a + " is prime number");
        else
            System.out.println(a + " is not prime number");

    }

    // checking even or odd
    public static void checkEvenOdd(int b) {
        if (b % 2 == 0)
            System.out.println(b + " is even number");
        else
            System.out.println(b + " is odd number");
    }

    // Table of a number
    public static void numberTable(int c) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(c + " X " + i + " = " + (c * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for checking Prime or not");
        int n1 = sc.nextInt();
        primeCheck(n1);
        System.out.println("enter a number for checking even or not");
        int n2 = sc.nextInt();
        checkEvenOdd(n2);
        System.out.println("Enter a number for get multiplication table ");
        int n3 = sc.nextInt();
        numberTable(n3);

    }
}
