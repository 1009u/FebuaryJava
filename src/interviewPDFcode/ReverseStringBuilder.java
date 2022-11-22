package interviewPDFcode;

public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder rev=new StringBuilder("Dharmendra");
        StringBuilder rev1=new StringBuilder("1234567");
        System.out.println("Before Reverse :"+rev);
        // After Reverse
        System.out.println("After Reverse :"+rev.reverse());
        System.out.println("Reverse 1 :"+rev1.reverse());

    }
}
