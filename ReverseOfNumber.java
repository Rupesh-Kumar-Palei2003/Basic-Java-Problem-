/*
A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
 */

import java.util.*;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int first_digit = (n % 10);  // (n/1)%10;
        int second_digit = (n / 10) % 10;
        int third_digit = (n / 100) % 10;
        int fourth_digit = (n / 1000);  // (n/1000)%10
        System.out.println((first_digit * 1000) + (second_digit * 100) + (third_digit * 10) + fourth_digit);
    }
}
