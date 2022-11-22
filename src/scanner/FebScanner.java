package scanner;

import java.util.Scanner;

public class FebScanner {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        String name=object.nextLine();           //for String value
        System.out.println("Good Day  Mr./Mrs.  :"+name);

        System.out.println("Please Enter Your Age : ");
        int age =object.nextInt();              //for Integer value
        System.out.println("Your age is   :"+age);

        System.out.println("Enter Your Salary :");
        double salary=object.nextDouble();
        System.out.println("Your salary is :"+salary);





    }
}
