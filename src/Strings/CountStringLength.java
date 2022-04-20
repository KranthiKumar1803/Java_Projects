package Strings;

import javax.print.DocFlavor;

/**
 * program to count the characters length in a string
 * using str.length()
 */
public class CountStringLength {
    public static void main(String[] args) {
        String str = "Train Java programming";

        int charLength = str.length();

        System.out.println("Here is the length of the string ::" + charLength);

        char c = str.charAt(3);
        System.out.println("index at @3 ::" + c);

      /*  for (int i = 0; i < str.length(); i++){
            i = i + 1;
           System.out.println("Lets see the result :: " + i);
        }*/

/**
 * counting the characters of String by converting them to a character array str.toCharArray() method
 *
 */
        char[] characterArraay = str.toCharArray();
        int charSpace = 0;

        for (char cType : characterArraay){
            if(cType == ' '){

                charSpace++;

            }

        }

        int length1 = charLength - charSpace;

        System.out.println("Char Length without space :: " + length1);

        }
}
