package Arrays;

import java.util.ArrayList;

/**
 * Converting Arraylist to String
 */

public class ArrayListToString {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        ArrayList<Runnable> avicky = new ArrayList<>();

        arrayList.add("Welcome");
        arrayList.add("To The Concept");
        arrayList.add("Of Arraylist to");
        arrayList.add("String");

        avicky.add(1, (Runnable) arrayList);

         //  String st = arrayList.toString();
        // Displaying the o/p like this Let's see the magic ::[Welcome, To The Concept, Of Arraylist to, String]
        //  System.out.println("Let's see the magic ::" + st);

       // StringBuffer sb = new StringBuffer();

        StringBuilder sb = new StringBuilder();
        for (String s : arrayList){
            sb.append(s);
           // sb.reverse();
            sb.append(" ");

        }

        String str =  sb.toString();

        System.out.println("Here is the output ::" + str);
    }
}
