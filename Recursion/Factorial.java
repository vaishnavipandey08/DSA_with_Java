import java.util.*;

public class Factorial {

    public static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1 ;
        }

        else {
            return n * factorial(n-1) ;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Number for Finding The Factorial : ");
        int number = sc.nextInt() ;
        
        int fact = factorial(number) ;

        System.out.println(fact);
    }
}
