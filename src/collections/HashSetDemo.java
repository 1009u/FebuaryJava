package collections;

import model.Charger;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> names =new HashSet<>();
        names.add("Kevin");
        names.add("Peter");
        names.add("Kevin");
        names.add("Peter");

        for (String player:names){
            System.out.println("Players Names is :"+player);
        }


        HashSet<Charger> demo_charger=new HashSet<>();

        Charger charger1=new Charger("DeltaOne",7399);
        Charger charger2=new Charger("Alfa",874);
        Charger charger3=new Charger("Omicron",9984);
        Charger charger4=new Charger("Omicron",9984);

        demo_charger.add(charger1);
        demo_charger.add(charger2);
        demo_charger.add(charger3);
        demo_charger.add(charger4);

        for (Charger var: demo_charger){
            System.out.println("Charger Specification :"+var.getCompany()+" "+var.getPrice());

        }
    }
}
