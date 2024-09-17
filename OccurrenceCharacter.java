public class OccurrenceCharacter {
    int first = -1;
    int last = -1;

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter a String");
        String str = sc.nextLine();
        System.out.println("enter a character to check ");
        char element = sc.next().charAt(0);
        OccurrenceCharacter obj = new OccurrenceCharacter();
        obj.occurrenceCharacter(str, 'a', 0);

    }

    public void occurrenceCharacter(String str, char element, int idx) {
        if (idx == str.length()) {
            System.out.println("first occurrence of " + element + " is " + first);
            System.out.println("last occurrence of " + element + " is " + last);
            return;
        }
        char currCharacter = str.charAt(idx);
        if (currCharacter == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurrenceCharacter(str, element, idx + 1);
    }
}