package LogicalOperations;

import java.util.Scanner;

/**
 *
 * Condition for palindrome is, it should be the same value when we reverse it eg: 121
 */

/**
 * ToDo
 * Need to check the code, have some issues
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        String original, reverse = " ";

        Scanner inputfromuser = new Scanner(System.in);

        System.out.println("Taking input from user :: ");

        int length;
        original = inputfromuser.nextLine();
        length = original.length();

        for (int i = length - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Here is the reverse number ::" + reverse);

        if (original.equals(reverse)){

            System.out.println("It's a Palindrome Number ::");

        }
        else{
            System.out.println("It's not a Palindrome Number");
        }


    }
}
