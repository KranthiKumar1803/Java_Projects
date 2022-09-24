package LogicalOperations;

import java.util.Scanner;

/**
 * Here we are trying to Swap the numbers
 * Lets take x and y as 2 numbers and a temp variable as a third
 * we are using Scanner class to take the input from user
 */

public class SwapNumbers {

    public static void main(String[] args) {
        int x;
        int y;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's take the inputs from user ::");
        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Numbers before swapping :: " + x + " " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("Numbers After swapping :: " + x + " " + y);


    }

}
