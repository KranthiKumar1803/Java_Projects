package LogicalOperations;

import java.util.Scanner;

/**
 * Fibonacci series is the combination of first 2 initial numbers
 * combined together gives the 3rd value as fibonacci number
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int num, x, y = 0,z = 1;

        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Getting number from user ::");
        num = inputNumber.nextInt();
        for (int i = 0; i < num; i++){
            x = y;
            y= z;
            z = x + y;

            System.out.println("Here is series of fibonacci :;" + x);

        }
    }
}
