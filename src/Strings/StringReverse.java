package Strings;


import java.time.Instant;

/**
 * We are reversing the String not using reverse() method
 * but without that. Lets see how!
 */

public class StringReverse {

    public static void main(String[] args) {
        String str1 = "BucchiBabu";

       // String str2 = "Anil";

        char[] chars = str1.toCharArray();

        for (int i = chars.length - 1; i >= 0 ; i--){

           System.out.println("Lets see the ::" + chars[i]);
       //    System.out.println("Result ::" + str2);


        }

    }
}
