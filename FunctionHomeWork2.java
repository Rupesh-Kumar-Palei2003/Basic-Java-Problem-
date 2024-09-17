/*

1.Enter 3 numbers from the user & make a function to print their average.
2.Write a function to print the sum of all odd numbers from 1 to n.
3.Write a function which takes in 2 numbers and returns the greater of those two.
4.Write a function that takes in the radius as input and returns the circumference of a circle.
5.Write a function that takes in age as input and returns if that person is eligible to vote or not.
  A person of age > 18 is eligible to vote.

 */


import java.util.*;

public class FunctionHomeWork2 {


    //1.Enter 3 numbers from the user & make a function to print their average.
    public static void averageOf3Number(int x, int y, int z) {
        int avg = (x + y + z) / 3;
        System.out.println("average of 3 number is " + avg);
    }


    //  2.Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOddNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //  3.Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greaterOfTwo(int x, int y) {
        return Math.max(x, y);
    }

    //  4.Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumferenceOfCircle(double x) {
        return 2 * 3.141 * x;
    }

    //5.Write a function that takes in age as input and returns if that person is eligible to vote or not.

    public static void eligibleVote(int x) {
        if (x > 18)
            System.out.println("Eligible for voting");
        else
            System.out.println("not eligible for voting");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter three number for get average");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        averageOf3Number(x, y, z);

        System.out.println("Enter a number for print sum of odd number from 1");
        int n = sc.nextInt();
        System.out.println(sumOfOddNumber(n));

        System.out.println("Enter two number for get greater among them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater among two number is " + greaterOfTwo(a, b));

        System.out.println("enter radius of circle");
        int c = sc.nextInt();
        System.out.println("circumference of circle is " + circumferenceOfCircle(c));

        System.out.println("Enter your age");
        int d = sc.nextInt();
        eligibleVote(d);

    }
}
