package com.java.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Please give the input ::" );

        num = input.nextInt();
        int factorial = 1;
        int i = 1;
         while(i <= num){

             factorial = factorial * i;
             i++;

             System.out.println("Here is the factorial ::" + factorial);

         }

         if (factorial == 120){
             String s = "Yahoo I got the answer ::";
             System.out.println(s);
         }
         else{

             System.out.println("The Factorial function is working as expected without 5! ::");
         }

    }
}
