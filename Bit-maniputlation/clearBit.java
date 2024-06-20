public class clearBit {
        public static void main(String[] args) {
        int n = 5 ;
        int position = 3 ;
        int bitMask = 1 << position ;
        int NonBitmask = ~(bitMask) ;

        int newNum = NonBitmask & n ;
        System.out.println(newNum);
        }

}
