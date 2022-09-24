package Exceptions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NestedTry {

    public static void main(String[] args) {

        try{
/*
            List newList = new ArrayList(1);
            newList.add("kittu");
            newList.add("kanna");

            for (Object a : newList) {
                System.out.println("Displaying newList :: " + a);
            }*/
            int a[] = {1,2,3,4,5,6,7,8,9};
           /* System.out.println("Elements are int he Array :: " + a[1]);
            System.out.println("newlist :: " + newList);*/
            try {
                int x = a[2]/0;

            }
            catch (ArithmeticException arithmeticException){

                System.out.println("Is it Throwing ArithmeticException");
            }


        }

        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){

            System.out.println("Throws arrayIndexOutOfBoundsException ");
            System.out.println("Throws elements not present at the index ");

        }
    }
}
