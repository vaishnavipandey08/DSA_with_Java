import java.util.*;

public class HalfPyramid {
   // public static void main(String[] args) {
   //  int n = 5 ;
   //  for(int i = 0 ; i<= n ; i++) {
   //     for(int j = 1 ; j <= i ; j++) {
   //        System.err.print("* ");
   //     }
   //     System.out.println();
   //  }

   // }


/*reversed Half Pyramid */

    // public static void main(String[] args) {
    //     int n = 5 ;
    //         for(int i = n ; i >= 1 ; i--) {
    //            for(int j = 1 ; j <= i ; j++) {
    //               System.err.print("* ");
    //            }
    //            System.out.println();
    //         }
        
    // }


    /*Inverted Rotated Half Pyramid  */

   //  public static void main(String[] args) {
   //      int n = 5 ;
   //      for(int i = 1 ; i<= n ; i++) {
   //         for(int j = 1 ; j <= n-i ; j++) {
   //            System.err.print(" ");
   //         }

   //         for(int j = 1; j <= i; j++) {
   //            System.out.print("*");
   //         }
   //         System.out.println();
   //      }
    
   //     }


   /*Half Pyramid with numbers */

   // public static void main(String[] args) {
   //    int n = 5 ;
   //    for(int i = 0 ; i<= n ; i++) {
   //       for(int j = 1 ; j <= i; j++) {
   //          System.err.print(j + " ");
   //       }
   //       System.out.println();
   //    }
  
   //   }


   /*Half Invertwd pyramid with Numbers */

   public static void main(String[] args) {
      int n = 5 ;
      for(int i = 0 ; i<= n ; i++) {
         for(int j = 1 ; j <= n-i+1 ; j++) {
            System.err.print(j + " ");
         }
         System.out.println();
      }
  
     }

     
}


