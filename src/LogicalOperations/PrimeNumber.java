package LogicalOperations;

import java.util.Scanner;

/**
 * We are programming to check if the entered number is prime or not
 * We use Scanner class to take input from user
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int temp;
        int num;
        boolean isPrime = true;

        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Input from the user::---");
        num = inputFromUser.nextInt();
        inputFromUser.close();
        for (int i = 2; i <= num/2; i++){
            temp = num % i;
            if (temp == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Given Number is a prime :: " + num);

        }
        else {
            System.out.println("Given Number is not a prime :: " + num);

        }
    }

}
