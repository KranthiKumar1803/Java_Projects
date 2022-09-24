package FunctionalPrograms;

import java.math.MathContext;
import java.util.Scanner;

public class PrintingNumbers {

    public static void main(String[] args) {

        Numbers myNum = new Numbers() {
            @Override
            public int expectNumber(int n) {

                if(n % 2 == 0){

                    return 2;
                }
                else if(n % 3 == 0) {

                    return 0;
                }
                    else {
                        return -1;
                }
            }
        };

        Numbers myNum2 = (n) -> 234;

        System.out.println("Using FI to fetch the data  :: " + myNum2.expectNumber(2));

        Scanner input =  new Scanner(System.in);
        System.out.println("Taking input from user :: ");
        int n = input.nextInt();

        System.out.println("Here is the i/p ::" + n);

        while (n != 2){

            System.out.println("It's not at all 2 ");

            System.exit(1);
        }
        System.out.println("Should not execute:");
        }

    }