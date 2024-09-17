import java.util.Scanner;

public class AttendancePercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total class held \t");
        float cls = sc.nextInt();
        System.out.println("Enter how many class you obtained \t");
        float obt = sc.nextInt();
        float per = (obt / cls) * 100;
        System.out.println("your attendance percentage is " + per);
        if (per >= 75) {
            System.out.println("So you are eligible for examination");
        } else {
            System.out.println("So you are not eligible for examination");
            System.out.println("Do you Have any medical issue if \n Yes then say Y \tor\n No then N");
            char c = sc.next().charAt(0);
            if (c == 'Y')
                System.out.println("Ok you are eligible for examination");
            else
                System.out.println("Oops.. you are not eligible for examination");
        }


    }
}
