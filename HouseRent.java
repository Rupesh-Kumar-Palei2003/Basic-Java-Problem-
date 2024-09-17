import java.util.*;

public class HouseRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of building :");
        int size = sc.nextInt();
        int[] building = new int[size];
        System.out.println("enter the number of flat containing each building");
        for (int flat = 0; flat < building.length; flat++) {
            System.out.println(flat + 1 + "th building containing flat : ");
            building[flat] = sc.nextInt();
        }

        System.out.println("Each building contain the flats are: ");
        for (int flat : building) System.out.print(" " + flat);

        int count = 1;
        int first_number = building[0];
        for (int j : building) {
            if (j > first_number) {
                first_number = j;
                count++;
            }

        }
        System.out.println("\n For your seen house you give Rent" + count * 20 + "$ for each building");
    }
}
