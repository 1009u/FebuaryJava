package array;

public class ArrayDemo {
    public void intValue(){
        //Syntax: Data_Type [] variable_name={, ,  , , , , , ,};
        int [] score={233,223,643,343};

        //print with  advance for loop
        for (int var:score){
            System.out.println("Score is : "+var);
        }
    }
    public void stringValue(){
        String [] city={"Pune","Delhi","Shimla"};
        for (String cities:city){
            System.out.println("Cities of India :"+cities);
        }
    }
    //double example
    public void doubleValue(){
        double [] rate={122.22,3322.23,3411,643.35};
        for(int i = 0; i<rate.length; i++){
            System.out.println("Different Type of Rates :"+rate[i]);
        }
    }

    public static void main(String[] args) {
        ArrayDemo obj=new ArrayDemo();
        obj.intValue();
        obj.stringValue();
        obj.doubleValue();

    }
}
