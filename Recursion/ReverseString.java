import java.util.*;

public class ReverseString {
    public static void printRev(String str, int idx) {
        if(idx == 0 ) {
            System.out.println(str.charAt(idx));
            return ;
        }

        System.out.println(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter The string for reverse : ");
        String str = sc.nextLine() ;
        System.out.println("The Reverse characters of String is :");
        printRev(str, str.length() - 1);
    }
}
