import java.util.*;

public class calcPower {

    public static int Power(int x , int n) {
        if(n == 0) {
            return 1 ;
        }
        if(x == 0) {
            return 0 ;
        }
        int xPownm1 = Power(x, n - 1) ;
        int  xPown = x * xPownm1 ;
        return xPown ;
    }

    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in) ;

       System.out.println("Number : ");
       int x = sc.nextInt() ;
       System.out.println("The number of Powers : ");
       int n = sc.nextInt() ;

       int ans = Power(x , n) ;
       System.out.println("Answer is :");
       System.out.println(ans);

    }
}
