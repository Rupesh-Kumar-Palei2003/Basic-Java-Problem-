public class MaxMinArray {
    public static int max(int[] arr) {
        int i = 0, storeMax = arr[i];
        while (i < arr.length - 1) {

            if (storeMax < arr[i + 1]) storeMax = arr[i + 1];
            i++;
        }
        return storeMax;
    }

    public static int min(int[] arr) {
        int i = 0, storeMin = arr[i];
        while (i < arr.length - 1) {
            if (arr[i + 1] < storeMin) storeMin = arr[i + 1];
            i++;
        }
        return storeMin;
    }

    public static void main(String[] args) {
        int[] arr = {50, 20, 10, 40, 30};
        System.out.println("Maximum element in array is :" + max(arr));
        System.out.println("Minimum element in array is :" + min(arr));
    }

}
