public class setBit {
        public static void main(String[] args) {
            int n = 5 ;
        int position = 3 ;
        int bitMask = 1 << position ;
        int newNum = bitMask | n ;

        System.out.println(newNum);
        }

        
}
