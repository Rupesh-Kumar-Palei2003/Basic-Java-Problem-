/*
A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class MaximumMoney {
    public static int maximumWealth(int[][] account) {
        int richest = 0;
        int[] amount = new int[account.length];
        for (int person = 0; person < account.length; person++) {
            for (int money = 0; money < account[person].length; money++) {
                amount[person] = amount[person] + account[person][money];
                System.out.println(amount[person]);
            }

        }
        return Wealth(amount);
    }

    public static int Wealth(int[] arr) {
        int richest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (richest <= arr[i + 1])
                richest = arr[i + 1];
        }
        return richest;

    }

    public static void main(String[] args) {
        int[][] arr = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(arr));
    }

}
