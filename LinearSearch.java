import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is :");
        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println();
        System.out.println("Enter a key for searching :");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("in index " + i + " found  " + key);
                break;
            }
        }
    }
}
