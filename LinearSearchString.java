import java.util.Arrays;

public class LinearSearchString {
    public static boolean checkString(String[] dict, String word) {
        for (String s : dict) {
            if (s.equals(word)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the size of string array....");
        int size = sc.nextInt();
        String[] dictionary = new String[size];
        System.out.println("enter " + size + " word ");
        for (int i = 0; i < size; i++) {
            dictionary[i] = sc.next();
        }
        System.out.println("enter a word for searching...:");
        String word = sc.next();
        System.out.println(checkString(dictionary, word));
        String str = "Linear Search String";
        String[] str1 = new String[]{Arrays.toString(str.toCharArray())};
        System.out.println(Arrays.toString(str1));
    }
}
