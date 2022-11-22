package exceptionHandling;

import java.util.Scanner;

public class CustomBalance {
    void Balance() throws BalanceException {
        System.out.println("Enter amount for withdraw :");
        Scanner obj=new Scanner(System.in);
        int balance=obj.nextInt();
        if (balance<500){
            throw new BalanceException("Invalid transaction Please Enter 500 + ");

        }
        else {
            System.out.println("Please wait for Your Transaction :");
        }

    }
    public static void main(String[] args) throws BalanceException {
        CustomBalance obj=new CustomBalance();
        obj.Balance();
    }
}
