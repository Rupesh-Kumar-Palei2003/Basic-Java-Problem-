import java.lang.*;
import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st array size");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd array size");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = Math.max(arr1.length, arr2.length);
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);
                }
            }
        }
        System.out.println(intersection);
    }
}
