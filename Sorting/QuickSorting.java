public class QuickSorting {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high] ;
        int i = low - 1;

        for(int j = low ; j < high ; j++) {
            if(arr[j] < pivot) {
                i++ ;
                int temp = arr[i] ;
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++ ;
        int temp = arr[i] ;
        arr[i] = pivot ;
        arr[high] = temp ;
        return i ;
    }

    public static void quickSort(int arr[] , int low , int high) {
        if(low < high) {
            int pivotidx = partition(arr , low , high) ;

            quickSort(arr, low, pivotidx-1);
            quickSort(arr, pivotidx+1 , high);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6 , 3 , 9, 5, 2 , 8} ;
        int n = arr.length ;

        System.out.println("Array before sorting : ");

        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        quickSort( arr , 0 , n -1) ;

        System.out.println("Array after sorting : ");

        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
