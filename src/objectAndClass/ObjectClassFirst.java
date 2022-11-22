package objectAndClass;

public class ObjectClassFirst {
    //class of mobile
    String brand="Samsung";
    int ram_in_GB=16;
    double price=32499.55;

    public static void main(String[] args) {
        ObjectClassFirst obj=new ObjectClassFirst();
        System.out.println(obj.brand);
        System.out.println(obj.ram_in_GB);
        System.out.println(obj.price);
    }
}
