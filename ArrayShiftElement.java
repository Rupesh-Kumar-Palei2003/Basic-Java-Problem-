/*
Q. Let array = {10,20,30,40}
    shift = 2; (shift two element into front)
    Output: {30,40,10,20}
 */

public class ArrayShiftElement {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int j = 0;
        for (int i = 3; i >= 2; i--) {
            int temp = arr1[j];
            arr1[j + 1] = temp;
            arr1[j] = arr1[i];
            j++;
        }
        for (int i : arr1) System.out.print(i + " ");


    }
}
