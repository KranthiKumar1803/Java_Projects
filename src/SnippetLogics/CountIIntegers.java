package SnippetLogics;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class CountIIntegers {

    public static int countIntegers(int a){
        int count = 0;
        while (a != 0){
            a = a/10;
            ++count;

            System.out.println("CountIIntegers : counting integers:: ---> " + count);



        }
            return count;
    }
    public static void main(String[] args) {

        System.out.println("Implementing count Integers method");
        int y = countIntegers(12345);

        System.out.println(" MAGIC ::");



        //Test case

       /* public void TestCaseCountIIntegers(int x){
            System.out.println("Testing ::");
            int t = countIntegers(12345);
            Assert.assertNotNull(t);
            Assert.assertEquals(t,12345);
        }*/
    }



}
