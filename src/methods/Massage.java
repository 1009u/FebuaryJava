package methods;

public class Massage {

    //method 1
    public void hello(){
        System.out.println("Welcome in Part of Methods....");
    }
    //method 2
    public void greetings(){
        System.out.println("Have a Nice Day EveryOne.....");
    }
    //method 3
    public void wishes(){
        System.out.println("Have a Cheerful Year.....");
    }
    public static void main(String[] args) {
        Massage massages=new Massage();
        massages.hello();
        massages.greetings();
        massages.wishes();
    }
}
