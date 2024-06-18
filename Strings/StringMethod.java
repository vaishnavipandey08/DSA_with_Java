public class StringMethod {
    public static void main(String[] args) {
        String firstName = "Vaishnavi";
        String lastName = "Pandey";

        //Concatenation
        String fullName = firstName + " " + lastName ;

        System.out.println(fullName);

        //Length
        System.out.println(fullName.length());

        //CharAT method
        for(int i = 0 ; i < fullName.length() ; i++ ) {
            System.out.println(fullName.charAt(i));
        }

        //Compare To Function 

        String name1 = "Tanya" ;
        String name2 = "Tanya" ;

        if(name1.compareTo(name2) == 0 ) {
            System.out.println("Strings are Equal ");
        }

        else {
            System.out.println("Strings are not equal.");
        }

        //Substrings 

        String sentence = "My name is Vaishnavi." ;

        System.out.println(sentence.substring(11,21));
        System.out.println(sentence.substring(10));
    }
}