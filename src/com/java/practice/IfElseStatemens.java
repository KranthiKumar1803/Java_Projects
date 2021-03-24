package com.java.practice;

import java.util.Scanner;

public class IfElseStatemens {


    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter the number Here : " +num );

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        System.out.println("I just entered the number bro : " +num);

        if(num % 2 == 0){

            System.out.println("Entered number is Even. Keep in Mind Even :" + num);

        }
        else{
            System.out.println("Entered number is Odd. Keep in Mind Odd :" + num);
        }
    }




}
