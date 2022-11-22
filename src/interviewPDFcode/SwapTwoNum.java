package interviewPDFcode;

import java.util.Scanner;

public class SwapTwoNum {

    public static void main (String [] args){
        System.out.println("Enter The value A and B  :");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b= obj.nextInt();

        System.out.println("Before Swapping Number : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping Number :"+a+" "+b);

    }
}
