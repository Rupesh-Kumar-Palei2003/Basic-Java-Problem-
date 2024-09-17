public class MaxMin2DArray {
    public static int min(int[][] arr) {
        int minStore = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (col < minStore) {
                    minStore = col;
                }
            }
        }
        return minStore;
    }

    public static int max(int[][] arr) {
        int maxStore = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (maxStore < col) {
                    maxStore = col;
                }
            }
        }
        return maxStore;
    }


    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30},
                {40, 50},
                {-90, -80, -70}};
        System.out.println("minimum element in array : " + min(arr));
        System.out.println("maximum element in array : " + max(arr));
    }
}
