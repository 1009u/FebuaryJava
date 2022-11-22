package interviewPDFcode;


public class ReverseStringDemo2 {
    public static void main(String[] args) {
        String city="Tundla";
        char [] rev=city.toCharArray();
        for (int i=rev.length-1; i>0; i--){
            System.out.println("Reverse Value is :"+rev[i]);
        }
    }
}
