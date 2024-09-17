public class ReverseNumberRecursion {
    static void reverseNumber(int rem, int sum, int num) {
        if (num == 0) {
            System.out.println("Reverse of is " + (sum + rem));
        } else {
            sum = (sum + rem) * 10;
            reverseNumber(num % 10, sum, num / 10);
        }


    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        try {
            reverseNumber(0, 0, num);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
