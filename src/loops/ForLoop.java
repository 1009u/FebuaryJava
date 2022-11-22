package loops;

public class ForLoop {
    public static void main(String[] args) {

       //Syntax: for (declaration ; condition ; increment/decrement){code}
        for (int i=0; i<10; i++){
            System.out.println("Hello..."+i);
        }
        //table of 11 print by loop
        for (int a=1; a<=10; a++){
            System.out.println("Table of 11 ..."+a*11);
        }

        for (int a=1;a<=10;a++){
            System.out.println(+a*6);
        }

        for (int a=1;a<=10;a++){
            System.out.println(a*5);
        }
    }
}
