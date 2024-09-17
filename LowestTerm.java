/*
Take as input a fraction in the form a/b.
Convert the same into Lowest terms and print.
(Lowest terms examples 3/12 = 1/4).
*/


import java.util.*;

public class LowestTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number in the form of (a/b)");
        int a = sc.nextInt();
        char c = sc.next().charAt(0);
        int b = sc.nextInt();
        System.out.println("your term is\t " + a + c + b);
        int num, den, temp;
        int gcd = 0;
        if (a > b) {
            num = a;
            den = b;
        } else {
            num = b;
            den = a;
        }
        while (den != 0) {
            temp = den;
            den = num % den;
            num = temp;
        }
        gcd = num;
        System.out.println("lowest term is \t " + (a / gcd) + "/" + (b / gcd));
    }
}
