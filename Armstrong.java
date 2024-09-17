/*
A three-digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 1 and 500.
 */

public class Armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            int t = i;
            while (t != 0) {
                sum = sum + ((t % 10) * (t % 10) * (t % 10));
                t = t / 10;
            }
            if (sum == i) System.out.println(i);
        }

    }

}
