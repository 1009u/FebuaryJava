package collections;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        //type 1
        HashMap<Integer ,String> company=new HashMap<>();
        //put value
        company.put(1,"TCS");
        company.put(2,"IBM");
        company.put(3,"BirlaSoft");
        //get value
        System.out.println("Zero index value :"+  company.get(1));
        System.out.println("Index of One :"+company.get(2));
        System.out.println("Index 2 :"+company.get(3));

        //type 2
        company.put(4,"Amdocs");
        company.put(5,"KPIT");
        company.put(6,"Cogzinent");

        System.out.println(company.get(4));
        System.out.println(company.get(5));
        System.out.println(company.get(6));

    }
}
