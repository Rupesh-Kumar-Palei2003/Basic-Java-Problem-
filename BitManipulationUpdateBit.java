/*
    Update Bit means change the position of bit 1 into 0 and vice-versa
    for example: update the 2nd bit of position 1 of number n = 0101.
 */

import java.util.Scanner;

public class BitManipulationUpdateBit {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = 1;
        System.out.println("What you want for update 1 or 0");
        int want = sc.nextInt();
        if (want == 1) {
            int BitMask = 1 << pos;
            int newNumber = BitMask | num;
            System.out.println(newNumber);
        } else {
            int BitMask = ~(1 << pos);
            int newNumber = BitMask & num;
            System.out.println(newNumber);
        }
    }
}
