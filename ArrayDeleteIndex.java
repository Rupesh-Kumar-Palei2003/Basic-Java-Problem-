import java.util.*;

public class ArrayDeleteIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter the element for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("array is : ");
        for (int j = 0; j < size; j++) {
            System.out.print(" " + arr[j]);
        }
        System.out.println();
        System.out.println("enter the  number for delete");
        int del = sc.nextInt();
        for (int j = 0; j < size; j++) {
            if (arr[j] == del) {
                for (int k = j; k < size; k++) {
                    arr[k] = arr[k + 1];
                }

            }
        }

        size = size - 1;
        for (int k = 0; k < size; k++) {
            System.out.println(arr[k]);
        }
    }
}


