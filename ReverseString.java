import java.lang.*;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("hello");
        String s = "hey";
        for (int i = st.length() - 1; i >= 0; i--) System.out.print(st.charAt(i));
        System.out.println();
        for (int i = s.length() - 1; i >= 0; i--) System.out.print(s.charAt(i));
    }
}
