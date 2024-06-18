import java.util.* ;


public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony") ;

        System.out.println(sb);

        //char At method 
        System.out.println(sb.charAt(0));
            
        //char Set method
        sb.setCharAt(0, 'P');  //Replaced T with P
        System.out.println(sb);

        //Insert any Character 

        sb.insert(2, 'n') ; //will inset the extra n oin Index 2
        System.out.println(sb);

        //Delete any Character 

        sb.delete(2, 4) ;  //will delete characters on 2 and 3
        System.out.println(sb);
        
        //Append any String character

        sb.append(' ');
        sb.append('y');
        sb.append('o');
        sb.append('d');
        sb.append('a');

        System.out.println(sb);
    }

}
