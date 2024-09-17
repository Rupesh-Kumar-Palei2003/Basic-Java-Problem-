import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] numbs = new int[size];
        System.out.println("enter array element");
        for (int i = 0; i < size; i++) {
            numbs[i] = sc.nextInt();
        }
        System.out.println("Is array contain duplicate element " + obj.containsDuplicate(numbs));
    }

    public boolean containsDuplicate(int[] numb) {
        Arrays.sort(numb);
        for (int i = 1; i < numb.length; i++) {
            if (numb[i] == numb[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
