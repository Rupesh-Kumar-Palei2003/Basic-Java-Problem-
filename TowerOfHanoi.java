public class TowerOfHanoi {
    public static void step(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        } else {
            step(n - 1, source, destination, helper);
            System.out.print("transfer disk " + n + " from " + source + " to " + destination);
            step(n - 1, helper, source, destination);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        step(n, "source", "helper", "destination");

    }
}
