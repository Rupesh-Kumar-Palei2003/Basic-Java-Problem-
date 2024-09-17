public class PermutationBackTracking {
    public static void permutation(String str, String permutation) {
        if (str.isEmpty()) {
            System.out.print(permutation + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, permutation + currChar);

        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("enter a string");
        permutation(word, "");
    }
}

/* Time complexity  = n * n!
    because  each step have n number and for each solution we need n! step so n * n!
 */

