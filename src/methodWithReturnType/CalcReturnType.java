package methodWithReturnType;

public class CalcReturnType {
    //we perform here add , sub, multi, and division
    // addition
    public int addition(int a,int b){
        return a+b;
    }
    //subtract
    public int subtract(int a, int b){
        return a-b;
    }
    //multiply
    public int multipy(int a, int b){
        return a*b;
    }
    // division
    public int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        CalcReturnType obj=new CalcReturnType();
       int Add= obj.addition(33,34);    //Add is output where we are saving our values
        System.out.println("Addition of A and B is ..."+Add);

       int Sub= obj.subtract(76,56);
        System.out.println("Subtract of A and B is ..."+Sub);

        int Multi=  obj.multipy(33,99);
        System.out.println("Multiply of A and B is ..."+Multi);

        int Div=obj.division(77,11);
        System.out.println("Division of A and B is ..."+Div);
    }
}
