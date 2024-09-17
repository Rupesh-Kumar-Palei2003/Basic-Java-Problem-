/*
Last character of a given string
sample input = "an apple is a fruit"
sample output = n e s a t
 */


import java.util.*;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.charAt(i - 1));
            }
        }
        System.out.print(str.charAt(str.length() - 1));
    }
}
