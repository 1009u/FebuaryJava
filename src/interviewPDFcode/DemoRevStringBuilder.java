package interviewPDFcode;

public class DemoRevStringBuilder {
    public static void main (String []args ){
        StringBuilder rev= new StringBuilder("Sonu Kumar");
        System.out.println(rev); // before use reverse method
        System.out.println(rev.reverse());
    }
}

class DemoRevStringBuffer{
    public static void main(String[] args) {
        StringBuffer rev1=new StringBuffer("lala");
        System.out.println(rev1.reverse());
    }
}
