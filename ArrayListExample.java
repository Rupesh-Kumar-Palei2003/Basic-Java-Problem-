import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list);

        System.out.println(list.get(1));
        list.set(1, 15);
        System.out.println(list);
        System.out.println(list.contains(40));

//        java.util.Scanner sc = new Scanner(System.in);
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        System.out.println("enter the number of list do you have");
//        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//           list.add(new ArrayList<>());
//        }
//        System.out.println("how many items do you want to insert");
//        int items = sc.nextInt();
//        System.out.println("insert the element");
//        for(int i=0; i<items; i++){
//            for(int j=0; j<items; j++){
//                list.get(i).add(sc.nextInt());
//            }
//        }
//        System.out.println(list);

    }
}
