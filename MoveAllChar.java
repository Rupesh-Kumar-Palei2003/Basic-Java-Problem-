public class MoveAllChar {

    public static void moveChar(String str, char element, int idx, StringBuffer newStr, int count) {

        if (idx == str.length()) {
            newStr.append(String.valueOf(element).repeat(Math.max(0, count)));
            System.out.println(newStr);
            return;
        }
        if (element == str.charAt(idx)) {
            moveChar(str, element, idx + 1, newStr, count + 1);
        } else if (element != str.charAt(idx)) {
            newStr.append(str.charAt(idx));
            moveChar(str, element, idx + 1, newStr, count);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a string ");
        String str = sc.nextLine();
        System.out.println("enter a character ");
        char element = sc.next().charAt(0);
        StringBuffer newStr = new StringBuffer();
        System.out.println(newStr);
        moveChar(str, element, 0, newStr, 0);
    }
}
