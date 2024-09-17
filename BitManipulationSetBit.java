import java.util.Scanner;

/* Set Bit means to set the position of a binary into 1
for example: Set the 2nd bit position 1 of a number n= 0101.
 */
public class BitManipulationSetBit {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int pos = 1;
        int BitMask = 1 << pos;
        int newNumber = BitMask | num;
        System.out.println(newNumber);
    }
}
