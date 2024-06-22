import java.util.*;

public class fibonacci {

    public static void fibSeq(int a, int b ,int n) {
       if(n == 0) {
        return ;
       }
       
        int c = a + b ;
       System.out.println(c);
       fibSeq( b, c , n-1) ; 
    }

    public static void main(String[] args) {

        int a = 0 , b = 1 ;
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Write a Number of terms Fibonacci Sequence ");
        int Number = sc.nextInt() ;
        
        System.out.println("The Fibonacci Sequence is : ");

        System.out.println(a);
        System.out.println(b);

        fibSeq( a, b , Number-2) ; 
    }
}
