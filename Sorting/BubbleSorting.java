import java.util.*;

public class BubbleSorting {

    public static void printArray(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int Size = sc.nextInt() ;
        int arr[] = new int[Size] ;
        int temp ;

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Array Before Sorting : ");
        printArray(arr);

        for(int i = 0 ; i < Size - 1 ; i++){
            for( int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ) {

                    //Perform Swapping
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;

                }
            }
        }

        System.out.println("Array after Swapping : ");
        printArray(arr);
    }
}

//Time Complexity of Bubble Sorting : O(n^2)
