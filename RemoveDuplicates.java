public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        RemoveDuplicates obj = new RemoveDuplicates();
        System.out.println(obj.removeDuplicates(arr));

    }

    public int removeDuplicates(int[] nums) {
        int numLength = nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                }
            }
        }

        return nums.length - count;
    }
}