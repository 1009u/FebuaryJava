package parameterizedConstructor;


public class Phone {
    String name;
    int ram;
    int price;

    public Phone(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public static void main(String[] args) {
        //Object 1
        Phone obj1=new Phone("MI",6,13500);
        System.out.println(obj1.name+" "+obj1.ram+" "+obj1.price);
        //object 2
        Phone obj2=new Phone("Nokia",6,14500);
        System.out.println("Name of Mobile -"+obj2.name);
        System.out.println("RAM of Mobile -"+obj2.ram);
        System.out.println("Price of Mobile -"+obj2.price);


    }
}
