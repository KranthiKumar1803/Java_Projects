package com.java.forloops;

public class ForEachExample {
    public static void main(String[] args) {
        int array[] = {14, 15, 65, 43, 45, 13};
        int sum = 0;
        // data type is mandatory
        //num is the item of an array to iterate all through it
        for(int num : array){

            sum += num;

            System.out.println("Here is the array of number :" + sum);

        }
    }
}
