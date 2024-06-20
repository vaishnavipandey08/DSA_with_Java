import java.util.*;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int operator = sc.nextInt() ;

        int n = 5 ;
        int pos = 2 ;

        int bitMask = 1 << pos ;

        if(operator == 1) {
           //set Operation
            int newNumber = bitMask | n ;
            System.out.println(newNumber);
        }

        else {
            int newBitMask = ~(bitMask) ;
            int newNumber = newBitMask & n ;
            System.out.println(newNumber);
        }
    }
}
