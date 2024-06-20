import java.util.*;

public class SelectionSorting {

    public static void printArray(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        int Size = sc.nextInt() ;
        int arr[] = new int[Size] ;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Array before Sorting  : ");
        printArray(arr);

        for(int i = 0 ; i < arr.length-1 ; i++) {
            int smallest = i ;
            for(int j = i+1 ; j < arr.length ; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j ;
                }
            }

            int temp = arr[smallest] ;
            arr[smallest] = arr[i] ;
            arr[i] = temp ;
        }
        System.out.println("Array after swapping : ");
        printArray(arr);
    }
}
