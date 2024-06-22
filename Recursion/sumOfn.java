import java.util.*;

public class sumOfn {

    public static void sumOfNumbers(int i , int n , int sum) {
        if(i == n) {
            sum += i ;
            System.out.println(sum);
            return ;  //Base Case
        }
        sum = sum + i ;
        sumOfNumbers(i+1 , n, sum);
    }
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Give a Number of sum : ");
        int n = sc.nextInt();
        
        int sum = 0 ;
        
        sumOfNumbers(1, n, sum);

    }
}
