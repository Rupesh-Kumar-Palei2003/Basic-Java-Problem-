import java.util.*;

public class StringsMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        System.out.println(s.substring(0, 5));
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.replace('s', 'p'));
        System.out.println("Rupesh".compareTo("Mentose"));
        if (new String("Rupesh") == new String("Rupesh"))
            System.out.println("equal");
        else
            System.out.println("Not equal");
        /*compareTo method used for comparing 2 different string
          when string1 > string 2---> +ve value
          when string 1 = string2---> 0
          when string 1 < string 2----> -ve value
         */

    }
}
