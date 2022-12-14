package interviewPDFcode;

import java.util.Scanner;

public class ArmstrongNumDemo {

    public static void main(String[] args) {
        System.out.println("Enter any Number :");
        Scanner obj=new Scanner(System.in);
        int no=obj.nextInt();

        int number = no, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber / 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}



