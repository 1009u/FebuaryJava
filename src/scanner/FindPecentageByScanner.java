package scanner;

import java.util.Scanner;

public class FindPecentageByScanner {
    public static void main(String[] args) {
        System.out.println("You can Check Marks Percentage Here :");
        System.out.println("Enter Total Marks");
        Scanner sc =new Scanner(System.in);
        float total=sc.nextInt();
        System.out.println("Enter Marks of Five Subject :");
        System.out.println("English :");
        float a=sc.nextFloat();
        System.out.println("Hindi :");
        float b=sc.nextFloat();
        System.out.println("Mathematics :");
        float c=sc.nextFloat();
        System.out.println("Science :");
        float d=sc.nextFloat();
        System.out.println("Social Science :");
        float e= sc.nextFloat();

        float sum=a+b+c+d+e;
        System.out.println("Your Total Marks is :");
        System.out.println(sum);

        float percentage=sum/total*100;
        System.out.println("Your Percentage is :");
        System.out.println(percentage);
    }
}
