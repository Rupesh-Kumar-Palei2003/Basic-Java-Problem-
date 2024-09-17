/*
At "YousPay" bank, the customer bank lockers uses digital lock. The digital lock is encoded in numeric form.
To decode the lock there are two methods. If the lock is encoded by an armstrong number, then the decoding
number is the sum of the even digits of the encoded number.If the encoded number is not an armstrong
number, then the decoding number is sum of the odd digits of the encoded number. An armstrong
number is a number that is the sum of its own digits each raised to the power of the number of digits
in the number.

write an algorithm to de-coded the digital lock.
 */

public class YouPayBank {
    public static void checkArmstrong(int num) {
        int rem, sum = 0, temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (sum == temp) {
            int evenSum = 0;
            while (sum > 0) {
                rem = sum % 10;
                if (rem % 2 == 0) {
                    evenSum += rem;
                }
                sum = sum / 10;
            }
            System.out.println("It is an armstrong number and sum of even digits is " + evenSum);
        } else {
            int oddSum = 0;
            while (temp > 0) {
                rem = temp % 10;
                if (rem % 2 != 0) {
                    oddSum += rem;
                }
                temp /= 10;
            }
            System.out.println("It is not an armstrong number and sum of even digits is " + oddSum);
        }

    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int encoded = sc.nextInt();
        checkArmstrong(encoded);
    }
}


