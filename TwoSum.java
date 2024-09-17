/*
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;

public class TwoSum {
    public static void sumTarget(ArrayList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    System.out.println("the sum of index " + i + " & " + j + " is " + target);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size in array :");
        int size = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(size);
        System.out.println("enter the array element: ");
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        System.out.print("List is : " + nums);
        System.out.println("\n Enter target number");
        int target = sc.nextInt();
        sumTarget(nums, target);
    }
}
