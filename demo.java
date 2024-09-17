//////public class demo {
//////    int a = 10;
//////    static int b =20;
//////
//////    public static void main(String[] args) {
//////        int c = 30;
//////        c = 34;
//////        final int d = 40;
//////        int a = 12;
//////        b=10;
//////        demo d1 = new demo();
//////        System.out.println(d1.a);
//////        System.out.println(a);
//////        System.out.println(d1.b);
//////        System.out.println(c);
//////        System.out.println(b);
//////        System.out.println(d1.a = 56);
//////        System.out.println(a);
//////    }
//////}
////
////import java.util.*;
////import java.math.*;
////public class demo {
//////    public int[] twoSum(int[] nums, int target) {
//////        int i, j;
//////        for (i = 0; i < nums.length; i++) {
//////            for (j = 1; j < nums.length; j++) {
//////                if (nums[i] + nums[j] == target) {
//////                    System.out.println();
//////                }
//////            }
//////        }
//////        return nums;
//////    }
//////
////
////
//////public static void main(String[] args) {
//////    java.util.Scanner sc  = new Scanner(System.in);
//////    String s = sc.nextLine();
//////    Double d = sc.nextDouble();
//////    int i = sc.nextInt();
//////
//////
//////    System.out.println("String: "+s);
//////    System.out.println("integer:"+i);
//////    System.out.println("Double: "+d);
//////}
////
//////    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//////        Set<Integer> set = new HashSet<>();
//////        for(int i=0; i<nums.length; i++){
//////            set.add(nums[i]);
//////        }
//////        Integer[] arr = new Integer[set.size()];
//////        int k=0;
//////        for(Integer j:set){
//////            arr[k++] = j;
//////        }
//////        for(int i: arr) {
//////            System.out.print(i);
//////        }
//////    }
////
//////    public void removeDuplicates(int[] nums) {
//////        int firstNum = 0;
//////        for(int i=0; i<nums.length; i++){
//////            if(i+1<nums.length){
//////                if(nums[i]==nums[i+1]){
//////                    System.out.print(nums[i]+",");
//////                }
//////            }
//////        }
//////
//////        }
//////
//////    public static void main(String[] args) {
//////        demo obj = new demo();
//////        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//////        obj.removeDuplicates(nums);
//////    }
////
//////    public static void main(String[] args) {
//////        System.out.println((int)Math.sqrt(8));
//////        System.out.println((double) 5);
//////        System.out.println((float)999999);
//////        System.out.println(Math.abs(-34.56));
//////
//////    }
////
////
////    int fact(int n) {
//////        if(n==1 || n==0) return 1;
//////        else return fact(n-1)*n;
////        int factorial = 1;
////        if (n == 0 || n == 1) return 1;
////        else {
////            for (int i =1; i<=n; i++){
////                factorial = factorial*i;
////            }
////        }
////        return factorial;
////    }
////    public int climbStairs(int x) {
////        int sum = 0;
////            for (int i = 0; i <= x; i++) {
////                try {
////                    sum = sum+ (fact(x-i) / (fact(i) * fact(x - i)));
////                    System.out.print(x+" "+sum+" ");
////                }catch (Exception e) {
////                    System.out.println(x+" "+e);
////                }
////
////        }
////        return sum;
////    }
////    public static void main(String[] args) {
////        demo obj = new demo();
////        System.out.println(obj.climbStairs(35));
////        System.out.println(obj.fact(4));
////    }
////}
//
//class demo{
//    public static void main(String[] args) {
//        System.out.println(args[0]);
//    }
//}
public class demo {
    public static int[] findFirstAndLastPosition(int[] nums, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            } else if (first != -1) {
                // If we have already found the first occurrence and the current element is not equal to the target,
                // we can break the loop early to save time.
                break;
            }
        }

        int[] result = {first, last};
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;

        int[] positions = findFirstAndLastPosition(nums, target);

        if (positions[0] != -1) {
            System.out.println("First Occurrence: " + positions[0]);
            System.out.println("Last Occurrence: " + positions[1]);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
