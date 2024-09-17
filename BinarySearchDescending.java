// wrong !!!!!
public class BinarySearchDescending {
    public static int Search(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            else if (target < arr[mid]) start = mid + 1;
            else end = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] Array = {50, 40, 30, 20, 10};
        System.out.println(Search(Array, 10));
    }
}
