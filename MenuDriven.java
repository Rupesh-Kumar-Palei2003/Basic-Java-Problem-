/*
Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
*/


import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either 1 or 0");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("How many subjects do you have");
            int sub = sc.nextInt();
            int temp = sub;
            int total_mark = 0;
            System.out.println("enter your marks out of 100");
            do {
                int mark = sc.nextInt();
                sub = sub - 1;
                total_mark = total_mark + mark;
            }
            while (sub > 0);
            int per = total_mark / temp;
            System.out.println("your total mark is " + total_mark + " and percentage is " + per + "%");
            if (per >= 90 & per <= 100)
                System.out.println("This is good");
            else if (per >= 60) {
                System.out.println("This is also Good");
            } else if (per >= 0) {
                System.out.println("This is good as well because marks doesn't matter but our effort does");
            }
        }
        if (n == 0) {
            System.out.println();
        }


    }
}
