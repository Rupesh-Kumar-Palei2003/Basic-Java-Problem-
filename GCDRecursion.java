public class GCDRecursion {
    public static int gcdCal(int a, int b) {
        if (a == b) return a;
        else if (a < b) return gcdCal(a, b - a);
        else return gcdCal(a - b, b);

    }

    public static void main(String[] args) {
        System.out.println(gcdCal(15, 20));
    }
}
