import java.util.*;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5 ;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < i ; j++ ) {
                sum = i + j ;
                if(sum%2 == 0 ) { //For Even
                    System.out.print("0 ");
                }
                else { // For odd
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
