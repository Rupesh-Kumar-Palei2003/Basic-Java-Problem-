import java.util.Scanner;

public class CheckSortedArrayRecursion {
    public static boolean checkSorted(int[] array, int index) {
        if (index == array.length - 1) return true;
        if (array[index] < array[index + 1]) {
            return checkSorted(array, index + 1);
        } else return false;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("enter the element for array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array is sorted : " + checkSorted(array, 0));

    }
}
