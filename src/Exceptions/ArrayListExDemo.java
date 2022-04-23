package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExDemo {
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();

        newList.add("Suman");
        newList.add(null);
        newList.add("HBO Channel");
        newList.add("WWW.prernahub.com");
        newList.add("Kiran");

        System.out.println("Displaying the newList ::" + newList);
        /**
         * Since the try/catch block is out of for loop
         * it's stopping the next element to execute for eg: string : Kiran
         */
        try {
            for (String s: newList) {
                if (s.contains("WWW")){
                    System.out.println("It's a website ::" + s);
                }
                else{
                    System.out.println("No it's a regular string ::" + s);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catching the Nullpointer Exception ::" +e);
        }
        /**
         * Lets's use the try/catch in a diff way
         * Using it to wrap if/else loop
         */

        for (String s1 : newList) {
            try {
                if (s1.contains("WWW")){
                    System.out.println("It's a website model ::" + s1);

                }
                else{

                    System.out.println("Comes under regular category ::" + s1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
