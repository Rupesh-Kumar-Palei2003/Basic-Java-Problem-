import java.util.*;

public class ArrayInsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter the element for array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array is: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Enter the position :");
        int pos = sc.nextInt();
        System.out.println("Enter the number");
        int key = sc.nextInt();
        for (int i = size; i > pos; i--) {
            arr[i + 1] = arr[i];
        }
        size = size + 1;
        arr[pos] = key;
        System.out.println("After inserting the array is : ");
        for (int j = 0; j < size; j++) {
            System.out.println(arr[j]);
        }
    }
}
