//import java.util.*;
//public class RomanToInteger {
//        public static void romanToInt(String s)
//        {
//            Map<Character,Integer> translations=new HashMap<Character,Integer>();
//
//            //Adding elements to map
//            translations.put('I',1);
//            translations.put('V',5);
//            translations.put('X',10);
//            translations.put('L',50);
//            translations.put('C',100);
//            translations.put('D',500);
//            translations.put('M',1000);
//
//            s = s.replace("IV","IIII");
//            s = s.replace("IX","VIIII");
//            s = s.replace("XL","XXXX");
//            s = s.replace("XC","LXXXX");
//            s = s.replace("CD","CCCC");
//            s = s.replace("CM","DCCCC");
//
//            int number = 0;
//            for (int i = 0; i < s.length(); i++)
//            {
//                number = number + (translations.get(s.charAt(i)));
//            }
//            System.out.println(number);
//        }
//        public static void main (String[] args)
//        {
//            romanToInt("CMDLI");
//        }
//    }
//

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.romanToInteger("MCMXCIV"));
    }

    int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'x') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;

        return -1;
    }

    int romanToInteger(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + s2 - s1;
                    i++;
                }
            } else
                res = res + s1;
        }
        return res;
    }

}