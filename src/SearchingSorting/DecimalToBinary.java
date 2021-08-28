package SearchingSorting;

/**
 * Decimal to Binary Conversion without using pre-defined methods in Java
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinary {

    private void toBinary(int num){


            int[] binary = new int[10];
            int index = 0;

            while (num > 0){
                binary[index++] = num % 2;
                num = num/2;
            }
            for (int i = index - 1; i >= 0; i--){
                System.out.println(binary[i]);
            }

    }

    public static void main(String[] args) {
        DecimalToBinary obj = new DecimalToBinary();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input from the user ::");

        int n = 0;
        try {
           n = sc.nextInt();
        } catch (InputMismatchException ne) {
            System.out.println("Please give a number ::");
            throw ne;

        }

        System.out.println("Binary conversion of a given number : " + n + " is");

            obj.toBinary(n);

    }

}
