/*Get Bit means to get the bit of given position
for example: get the 3rd bit of position = 2 of a number n= 0101.
 */

import java.util.*;

public class BitManipulationGetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int pos = 3;
        int bitMask = 1 << pos; //left shift
        int newNumber = num & bitMask; // and operation
        System.out.println(newNumber);
        if ((bitMask & num) == 0) System.out.println("Bit was Zero ");
        else System.out.println("Bit is one");
    }
}
