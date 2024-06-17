import java.util.*;

public class LinearSearch {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = {2,6,4,7,2,8} ;
       int number = sc.nextInt() ;

       for(int i = 0 ; i <= arr.length ; i++ ) {
             if(arr[i] == number ) {
                System.out.println("The Number is on index : " + i );
             }
       }
       
     }
}