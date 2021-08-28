package Lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Using Lambda expressions from Java 8
 * Using Consumer Interface from Java 8
 */

public class DisplayNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(99);
        arrayList.add(92);
        arrayList.add(19);
        arrayList.add(95);
        arrayList.add(95);
        arrayList.add(90);

      //System.out.println("Here is the Arraylist ::" + arrayList);

      arrayList.forEach(integer -> {
          System.out.println(integer);
      });

        Consumer<Integer> consumer = integer -> System.out.println("Using the Consumer Interface - 1 ::" + integer);
        // System.out.println(" Using the Consumer Interface - 2 ::" + consumer);
        arrayList.forEach(consumer);

        if (arrayList.isEmpty() || arrayList == null){
            System.out.println("Arraylist is Empty");
        }
        else {
            System.out.println("Arraylist is Working as expected");
        }

    }
}
