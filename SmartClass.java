import java.util.*;

public class SmartClass {

    public static boolean isPrime(int num) {
        int i = 2;
        for (; (i < num / 2) && (num % i != 0); i++) ;
        if (i >= num / 2) return true;
        else return false;

    }

    public static void main(String[] args) {
        boolean res = isPrime(130);
        if (res == true) System.out.println("Prime");
        else System.out.println("Not prime");
//        int i=1;
//        for(System.out.println("Hey..");i<=10; System.out.println("Nice Coding ")){
//            System.out.print(i+" ");
//            i+=1;
//        }


    }
}

