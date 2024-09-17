/*
Take n integers from keyboard using loop and print their average value on the screen.

 */

import java.util.*;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range for calculating the average  ");
        int n = sc.nextInt();
        int avg = 0;
        for (int i = 0; i < n; i++) {
            avg = (n * (n + 1)) / 2;
        }
        System.out.println("average of till n number is " + avg);


    }
}
