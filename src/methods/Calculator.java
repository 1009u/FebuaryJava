package methods;

public class Calculator {
    //we will create here Add , Sub , Multiply , Division method
    // Add method
    public void addition(){
        int a=12;
        int b=11;
        int sum=a+b;
        System.out.println("Addition of A and B is ...."+sum);
    }

    //subtract method
    public void subtract(){
        int a=67;
        int b=65;
        int sub=a-b;
        System.out.println("Subtract A and B is ...."+sub);
    }

    //multiply method
    public void multiply(){
        int a=87;
        int b=2;
        int multi=a*b;
        System.out.println("Multiply of A and B is ......"+multi);
    }

    //Division method
    public void division(){
        int a=890;
        int b=2;
        int div=a/b;
        System.out.println("Division of A and B is ....."+div);
    }

    public static void main(String[] args) {
        Calculator method=new Calculator();
        method.addition();
        method.subtract();
        method.multiply();
        method.division();

    }
}
