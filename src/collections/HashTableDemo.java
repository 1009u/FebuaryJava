package collections;

import java.util.Hashtable;


public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> card = new Hashtable<>();

        card.put(2, "Red");
        card.put(3, "Green");

      //  card.forEach((key, value) -> System.out.println(key + "  " + value));

      System.out.println("Print of name "+card.get(2));

}

}