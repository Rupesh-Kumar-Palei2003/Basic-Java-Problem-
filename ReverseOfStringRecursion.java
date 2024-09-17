public class ReverseOfStringRecursion {
    static int s = 5;

    public static void recursion(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        recursion(str, idx - 1);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("enter a string :");
        String str = sc.next();
        System.out.print("Reverse of " + str + " is ");
        s = 7;
        System.out.println(s);
        recursion(str, str.length() - 1);
    }
}
