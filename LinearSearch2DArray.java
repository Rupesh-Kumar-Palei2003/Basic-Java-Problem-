//import java.util.*;
//public class LinearSearch2DArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter number of columns");
//        int col = sc.nextInt();
//        int[][] num = new int[rows][col];
//        System.out.println("Enter the element for 2D array");
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<col; j++){
//                num[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Your 2D array is : ");
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<col; j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("Enter a element for searching");
//        int key = sc.nextInt();
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<col; j++){
//                if(key == num[i][j]) {
//                    System.out.println("Your number is found in the index of " + (i + "," + j));
//                    break;
//                }
//            }
//        }
//    }
//}


import java.util.Arrays;

public class LinearSearch2DArray {
    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[][] Array = {{10, 20, 30},
                {40, 50},
                {-70, -80, -90}};
        System.out.println(Arrays.toString(search(Array, -80)));

    }
}