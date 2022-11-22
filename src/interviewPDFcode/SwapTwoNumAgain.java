package interviewPDFcode;

import java.util.Scanner;

public class SwapTwoNumAgain {
    public static void main(String[] args) {
        System.out.println("We will Swap two Number without Third Variable :");
        System.out.println("Please Enter Value A and B :");
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();

         a=a+b;
         b=a-b;
         a=a-b;
        System.out.println(a+" "+b);




    }
}
