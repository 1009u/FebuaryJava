package interviewPDFcode;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String name= "AKASH";

        char [] rev= name.toCharArray();

        for (int i= rev.length-1; i>0; i--){
            System.out.println(rev[i]);
        }

    }
}

