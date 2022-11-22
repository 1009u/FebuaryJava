package exceptionHandling;

import java.util.Scanner;

public class CustomException {
    public void vote() throws AgeException {
        Scanner obj=new Scanner(System.in);
        int age=obj.nextInt();
        if (age<18){
            throw new AgeException("Sorry You are Not Eligible for voting..");
        }
        else {
            System.out.println("Welcome In Voting Portal");
            System.out.println("Please Enter 1 for New Enrollment and Enter 2 for Update Your Id :");

        }
    }
    public static void main(String[] args) {
        CustomException object=new CustomException();
        try {
            object.vote();
        } catch (AgeException e) {
            e.printStackTrace();
        }

    }
}
