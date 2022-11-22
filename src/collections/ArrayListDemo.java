package collections;

import model.Charger;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <Charger> type_charger= new ArrayList<>();

        Charger charger1=new Charger("Windproof",450);
        Charger charger2=new Charger("LandScape",764);
        Charger charger3= new Charger("NewStone",650);

        type_charger.add(charger1);
        type_charger.add(charger2);
        type_charger.add(charger3);

        charger1.setCompany("Pathways");
        charger2.setPrice(850);
        type_charger.remove(charger3);

        for (Charger var:type_charger){
            System.out.println("Chargers :"+var.getCompany()+" "+var.getPrice());
        }
    }
}
