import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {


//        java.util.Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter row number");
//        int num = sc.nextInt();
//        int num1 = sc.nextInt();
//        int[][] arr = new int[num][num1];
//        System.out.println("Enter the element in array");
//        for(int row =0; row<num; row++){
//            for(int col =0; col< num1; col++){
//                arr[row][col] = sc.nextInt();
//            }
//        }
//        for(int[] a:arr) {
//            System.out.println(Arrays.toString(a));
//        }


        int[][] arr = {{1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int[] a : arr) System.out.println(Arrays.toString(a));
        System.out.println();
        for (int[] ints : arr) System.out.println(Arrays.toString(ints));
    }
}
