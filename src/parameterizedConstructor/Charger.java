package parameterizedConstructor;

public class Charger {
    String brand;
    int price;

    public Charger(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public static void main(String[] args) {
        //Charger 1
        Charger charger1=new Charger("Yahoo",100);
        System.out.println("Brand of Charger -"+ charger1.brand+" ; "+"Price of Charger -"+ charger1.price);
        //charger 2
        Charger charger2=new Charger("Faster",200);
        System.out.println("Second Charger Brand -"+charger2.brand);
        System.out.println("Second Charger Price -"+charger2.price);

    }
}
