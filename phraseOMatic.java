import java.util.*;

public class phraseOMatic {
    public static void main(String[] args) {
        String wordList1[] = {"Python", "Java", "Ruby", "C", "C++", "Php"};
        String wordList2[] = {"Hard", "Semi-Hard", "medium", "easy", "very-easy"};
        int lenList1 = wordList1.length;
        int lenList2 = wordList2.length;
        Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(lenList1);
        int rand2 = randomGenerator.nextInt(lenList2);
        System.out.println(wordList1[rand1]);
        String phrase = wordList1[rand1] + " is " + wordList2[rand2];
        System.out.println(phrase);
    }
}
