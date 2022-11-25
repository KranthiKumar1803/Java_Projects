package basics;

import java.util.Scanner;

public class AverageExmpl {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;


        for (int i = 0; i < 10; i++){
            System.out.println("Enter the input ::" );
            sum = sum +s.nextInt();

        }
        System.out.println("Lets see the o/p ::" + sum);
    }
}
