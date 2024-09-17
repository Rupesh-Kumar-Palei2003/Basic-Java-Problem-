/*
   Clear bit means clear the position i.e. set the given position into 0 of a binary number
   for example: Clear 3rd bit position 2 of a number n = 0101.
 */

public class BitManipulationClearBit {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int pos = 2;
        int BitMask = ~(1 << 2);
        int newNumber = BitMask & num;
        System.out.println(newNumber);
    }
}
