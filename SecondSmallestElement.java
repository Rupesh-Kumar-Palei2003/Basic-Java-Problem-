public class SecondSmallestElement {
    public static int secondElement(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        return nums[1];
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter array element");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("array is :");
        for (int j : nums) System.out.print(j + " ");
        System.out.println("Second element of array " + secondElement(nums));

    }
}
