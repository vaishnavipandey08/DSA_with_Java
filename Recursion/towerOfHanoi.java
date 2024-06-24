import java.util.*;

public class towerOfHanoi {
    
    public static void tOHanoi( int n , String src , String helper , String dest ) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest) ;
            return ;
        }

        tOHanoi(n - 1, src, dest, helper) ;
        System.out.println("transfet disk " + n + " from " + src + " to " + dest) ;
        tOHanoi( n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Number of disks : ");
        int n = sc.nextInt() ;

        tOHanoi(n, "Source", "Helper", "Destination");
    }
}
