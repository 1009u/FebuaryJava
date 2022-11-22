package scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Name : ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello : ");
        System.out.println(name);
        System.out.println("Enter Your Age :");
        int age=sc.nextInt();
        System.out.println("You have Entered Your Age is :");
        System.out.println(age);

    }
}
