package interviewPDFcode;

import java.util.Arrays;

public class FindSecondLargestByArrays {
     public static  int getSecondLar(int [] a, int total){
         Arrays.sort(a);
         return a[total-2];
     }
    public static void main(String[] args) {
     int [] a={2,4,5,7,8,9};
     int [] b={84,25,45,33,35,76};
        System.out.println("Second Largest :"+getSecondLar(a,6));
        System.out.println("Second Largest :"+getSecondLar(b,6));
    }
}
