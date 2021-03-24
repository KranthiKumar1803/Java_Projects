package com.java.practice;

/*
 * To print the sum of particular numbers
 */

public class Main {
   // public String val = "20";

    public static void main(String[] args) {
        int x , sum;

        for(x = 1, sum = 0; x <= 10; x++){
            System.out.println("Here is the incremented value : " + x);
            sum = sum + x;

        }
        System.out.println("Sum of the numbers printed here  : " + sum);


    }
}
