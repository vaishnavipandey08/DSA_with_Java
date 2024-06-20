import java.util.*;

public class InsertionSorting {
    public static void printArray( int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int size = sc.nextInt() ;

        int arr[] = new int[size] ;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Array Before Sorting : ");
        printArray(arr);
      
        for(int i = 1 ; i < arr.length-1 ; i++){
            int current = arr[i] ;

            int j = i-1 ;

            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j] ;
                j-- ;
            }

            arr[j+1] = current ;
        }

        System.out.println("Array After Sorting : ");
        printArray(arr);
    }
    
}
