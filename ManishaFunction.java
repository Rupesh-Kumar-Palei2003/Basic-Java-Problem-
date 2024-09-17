import java.util.Scanner;
public class ManishaFunction {

    // Function Definition
    public static void add(int x, int y){
        System.out.println("sum is"+x+y);
    }
    public  static void  sub(int x, int y){
        System.out.println("substract"+(x-y));
    }

    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        add(m,n);
        sub(m,n);

    }

}
