import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark percentage");
        int m = sc.nextInt();
        if (m > 90 & m < 100) {
            System.out.println("you have 'O' grade");
        }
        if (m > 80 & m < 90) {
            System.out.println("you have 'E' grade");
        }
        if (m > 70 & m < 80) {
            System.out.println("you have 'A' grade");
        }
        if (m > 60 & m < 70) {
            System.out.println("you have 'B' grade");
        }
        if (m > 50 & m < 60) {
            System.out.println("you have 'C' grade");
        }
        if (m > 40 & m < 50) {
            System.out.println("you have 'D' grade");
        }
        if (m < 40) {
            System.out.println("you have 'F' grade");
        }
    }
}
