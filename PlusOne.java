import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

/*
    public ArrayList<Integer> plusOne(int[] digits) {
        int number = 0;
        ArrayList<Integer> plusOneArray = new ArrayList<>(digits.length);
        for (int i = 0; i < digits.length; i++) {
           number = (number+digits[i])*10;
            if (i == digits.length - 1) {
                plusOneArray.add(digits[i] + 1);
            } else {
                plusOneArray.add(digits[i]);
            }
        }
        return plusOneArray;
    }

    public static void main(String[] args) {


        PlusOne obj = new PlusOne();
        int[] digits = {1,2,3};
        System.out.println(obj.plusOne(digits));
    }
*/

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();
        int[] digits = {1, 2, 8};
        System.out.println(Arrays.toString(obj.plusOne(digits)));

    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] afterPlusOne = null;
        for (int i = 0; i < length; i++) {
            if (digits[length - 1] == 9) {
                afterPlusOne = new int[length + 1];
                afterPlusOne[i] = 1;
                afterPlusOne[i + 1] = 0;
            } else if (i == length - 1) {
                afterPlusOne = new int[length];
                afterPlusOne[i] = digits[i] + 1;
            } else if (i < length - 1) {
                afterPlusOne = new int[length];
                afterPlusOne[i] = digits[i];
            }
        }

        return afterPlusOne;
    }
}
