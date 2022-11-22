package scanner;

import java.util.Scanner;

public class CalCScanner {
    //in addition
    public int Addition(int a , int b){
        return a+b;
    }
    //for subtract
    public int Subtract(int a , int b){
        return a-b;
    }
    //for multiply
    public int Multiply(int a, int b){
        return a*b;
    }
    //for division
    public int Divide(int a, int b){
        return a/b;
    }

    public static void main(String [] args){
        int choice;
        int a;
        int b;

        Scanner object=new Scanner(System.in);
        System.out.println("Welcome in Calculator Type Enter 1 for Add , 2 for Sub, 3 for Multiply and 4 for Divide : ");
        choice=object.nextInt();
        System.out.println("Enter Value of A and B :-");
        a=object.nextInt();
        b=object.nextInt();


        //create object
        CalCScanner obj=new CalCScanner();

        if (choice==1){
            int sum=obj.Addition(a,b);
            System.out.println("Addition of A and B is :"+sum);
        }
        else if(choice==2){
            int sub=obj.Subtract(a,b);
            System.out.println("Subtract of A and B is :"+sub);
        }
        else if (choice==3){
            int multi=obj.Multiply(a,b);
            System.out.println("Multiply of A and B is  :"+multi);
        }
        else if (choice==4){
            int div=obj.Divide(a,b);{
                System.out.println("Divide of A and B is :"+div);
            }
        }

    }
}
