import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st set size :");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("enter the element for 1st set : ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter 2nd array size :");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("enter the element for 2nd set : ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        // print two array
        System.out.println("1st set is :");
        for (int i : arr1) System.out.print(i + ",");
        System.out.println("\n 2nd set is :");
        for (int j : arr2) System.out.print(j + ",");

        int max = Math.max(size1, size2);
        int min = Math.min(size2, size1);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < min; j++) {
                //complete it early
            }
        }


    }
}
