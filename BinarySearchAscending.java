public class BinarySearchAscending {

    public static int Search(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2; // it is same as (start+mid)/2. and it takes less space.
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] Array = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(Search(Array, 70));

    }
}
