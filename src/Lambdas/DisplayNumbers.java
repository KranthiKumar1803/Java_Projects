package Lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("K1", "Kittu");
        hashMap.put("K2", "Ali");
        hashMap.put("K3", "ShivaRam");
        hashMap.put("K4", "Sudheer");


      System.out.println("Here is the regular hashMap representation ::" + hashMap);

      arrayList.forEach(a -> {
          System.out.println("Simple forEach :: " + a);
      });

        arrayList.forEach(c -> System.out.println("Using consumer's C as a lambda param " +  c)  );

        if (hashMap.containsKey("K4")){
            hashMap.remove("K4");

            hashMap.forEach((h1, h2) -> System.out.println("Trying forEach in Map :: " + h1  +"  " + h2));

            System.out.println("Initiating entrySet");
            hashMap.entrySet();

           String s =  hashMap.get("K2");

           System.out.println("Let's see what happens -- Displays the associated key name :: " + s);

           if (s.endsWith("i")){

               System.out.println("Display the key and name :: " + s.toUpperCase());
           }


        }

        System.out.println("Modified HashMap ::" + hashMap);
        arrayList.clear();

        System.out.println("ArrayList cleared");
    }
}
