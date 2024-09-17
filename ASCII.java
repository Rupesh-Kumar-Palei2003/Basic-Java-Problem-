/*
Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.
 */

import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        int n = ch;
        System.out.println(ch + " " + n);
    }
}
