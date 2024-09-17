import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element in array");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        System.out.println("Array is : ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println("\n After sorting the array is :");
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int k = 0; k < arr.length; k++) System.out.print(" " + k);
    }
}
