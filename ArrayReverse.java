import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is \n" + Arrays.toString(arr));

        int start = 0, end = arr.length - 1, temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reverse array is " + Arrays.toString(arr));
    }
}
