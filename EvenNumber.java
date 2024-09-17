import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for finding the even number from 0 ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

    }
}
