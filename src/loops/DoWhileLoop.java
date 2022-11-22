package loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        //Syntax: do {code x++;} while (condition)
        int c=0;
        do {
            System.out.println("Value of C is less than 6 - "+c);
            c++;
        }
        while (c<5);

        //Table of 13
        int d=0;
        do {
            System.out.println("Table of 13 - "+d*13);
            d++;
        }
        while (d<=10);

    }
}
