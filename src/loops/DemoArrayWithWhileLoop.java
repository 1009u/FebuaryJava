package loops;

import java.util.ArrayList;

public class DemoArrayWithWhileLoop {
    public static void main(String[] args) {
        ArrayList<Number> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(96);
        numbers.add(12);
        numbers.add(48);
        numbers.add(56);
        numbers.add(45);

        int value=0;
        while (numbers.size()>value){
            System.out.println(numbers.get(value));
        }
        value++;


    }
}
