package methodWithReturnType;

public class MethodWithParameter {
    //String Parameter
    public String city(String name){
        String city_name="Welcome in,"+name;
        return city_name;
    }
    //Integer Parameter
    int square_of_digit(int digit){
        int square=digit*digit;
        return square;
    }


    public static void main(String[] args) {
        MethodWithParameter object=new MethodWithParameter();
   //Note: we are making here variables for Store output Like - cityName_output
       String cityName_output= object.city("Kanpur");
        System.out.println(cityName_output);
        //Integer parameter return
       int output= object.square_of_digit(11);
        System.out.println("Square of Digit is ..."+output);
    }
}
