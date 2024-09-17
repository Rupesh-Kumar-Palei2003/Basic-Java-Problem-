import java.util.*;

public class OrderAgnosticBinarySearch {
    public static int searchIndex(int[] arr, int target) {
        if (arr[0] < arr[arr.length - 1]) {
            return searchAscending(arr, target);
        } else if (arr[0] > arr[arr.length - 1]) {
            return searchDescending(arr, target);

        }
        return -1;
    }

    public static int searchAscending(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
        }
        return -1;

    }

    public static int searchDescending(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (target > arr[mid]) end = mid - 1;
            else if (target < arr[mid]) start = mid + 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("enter the element either Ascending or Descending: ");
        for (int i = 0; i < size; i++) {
            Array[i] = sc.nextInt();
        }
        System.out.println("enter your target element: ");
        int target = sc.nextInt();
        if (searchIndex(Array, target) == -1)
            System.out.println("your element is not found: ");
        else
            System.out.println("your target element found in index : " + searchIndex(Array, target));

    }
}
