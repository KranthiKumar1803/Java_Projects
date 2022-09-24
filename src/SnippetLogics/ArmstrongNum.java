package SnippetLogics;

import java.util.Scanner;

/**
 * Number with multplied cubes of those individual numbers will be equal
 */

public class ArmstrongNum {
    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Getting i/p from user ::");

        number = sc.nextInt();

        originalNumber = number;

       // System.out.println("Static I/p  --> ::" + originalNumber);

        while (originalNumber != 0){

            remainder = originalNumber % 10;
            result = (int) (result + Math.pow(remainder,3));
            originalNumber = originalNumber/10;


        }

        if (result == number){
            System.out.println("An Armstrong number ::");
        }
        else {
            System.out.println("It's not an Armstrong number ::");
        }
//        if (sc.hasNext()){
//            System.out.println("Lets see ::" + sc.hasNext());
//        }

    }
}
