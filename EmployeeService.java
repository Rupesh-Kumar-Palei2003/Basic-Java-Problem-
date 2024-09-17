/*
Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.

if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".
 */


import java.util.Scanner;

public class EmployeeService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your gender (M or F) ");
        char sex = sc.next().charAt(0);
        System.out.println("Marital Status (Y or N) ");
        char sts = sc.next().charAt(0);
        if (sex == 'F') {
            System.out.println(" you will work only in urban areas.");
        } else if (sex == 'M' && age >= 20 && age <= 40) {
            System.out.println("you may work in anywhere");
        } else if (sex == 'M' && age >= 40 && age <= 60) {
            System.out.println(" he will work in urban areas only.");
        } else
            System.out.println("ERROR...!!!!!");


    }
}
