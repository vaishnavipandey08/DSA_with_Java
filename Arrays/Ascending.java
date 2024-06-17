import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;
        int numbers[] = new int[size] ;

        for(int i = 0 ; i < size; i++ ) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true ;

        for(int i = 0 ; i < size-1 ; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false ;
            }

        }

        if(isAscending) {
            System.out.println("Array is Sorted.. ");
        }

        else {
            System.out.println("Array is Not Sorted..");
        }
    }
}
