package conditional;

public class IfandElseFirst {
    public static void main(String[] args) {
        //Syntax:if (condition) {code} else {code}
        int marks=600;
        if (marks<400)
        {
            System.out.println("Ravindra kumar passed with First Division...");
        }
        else {
            System.out.println("Ravindra Kumar Topper of The College...");
        }

        //for String Value
        String city="Agra";
        if (city=="Agra"){
            System.out.println("You are in Agra..");
        }
        else {
            System.out.println("You are in another City...");
        }

    }
}
