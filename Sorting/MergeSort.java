import java.util.*;

public class MergeSort {

    public static void printArray( int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void conquer(int arr[] , int start , int mid , int end) {
        int merged[] = new int[end - start + 1];

        int idx1 = start;
        int idx2 = mid + 1 ;
        int x = 0 ;

        while(idx1 <= mid && idx2 <= end) {
           if(arr[idx1] <= arr[idx2]) {
            merged[x] = arr[idx1] ;
            x++ ; idx1++;
           } else {
            merged[x] = arr[idx2] ;
            x++ ; idx2++ ;
           }
        }

        //For Rest Elements : In case if it is

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++] ;
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++] ;
        }

        for(int i = 0 , j = start ; i < merged.length ; i++, j++) {
            arr[j] = merged[i] ;
        }
    }

    public static void divide(int arr[] , int start , int end) {
        if(start >= end) {
            return ;
        }

        int mid = start + (end - start)/ 2 ;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Size of Array : ");
        int size = sc.nextInt() ;

        System.out.println("Elements of Array : ");
        int arr[] = new int[size] ;

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt() ;
        }

        System.out.println("Array Before Sorting : ");
        printArray(arr);

        System.out.println();

        divide(arr, 0 , size - 1);

        System.out.println("Array after Sorting : ");
        printArray(arr);
    }
}
