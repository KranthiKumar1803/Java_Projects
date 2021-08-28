package Map;

import java.util.*;

/**
 * HashMap allows 1 null key and multiple null values
 * HashMap can't have duplicate keys
 * Hashmap has key value pairs
 * If there are multiple duplicate keys available then it will override/replace with existing pair in the key value pair
 */

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> objMap = new HashMap<>();

        objMap.put(1,"Alex");
        objMap.put(null,"Wayne");
        objMap.put(3,"Jason");
        objMap.put(2,"Tom");
        objMap.put(4,"Vijay");
        objMap.hashCode();

        System.out.println("Result ::" + objMap);

        System.out.println("Size Result ::" + objMap.size());

        //Returns false because hashMap is not empty
       // System.out.println("Result if empty ::" + objMap.isEmpty());


        if (objMap.containsKey(3)){
            System.out.println("Contains the key:: ");
        }
        else{
            System.out.println("Doesn't contain it");
        }

        if (objMap.containsValue("Tom")){
            System.out.println("Contains the value:: ");
        }
        else {
            System.out.println("Doesn't have the value:: ");
        }

        //get value by Key

        String k1 = objMap.get(1);

        System.out.println("Get the value based on Key ::" + k1);

        //remove keys from HashMap

        String k2 = objMap.remove(1);

        System.out.println("Remove the value based on Key ::" + k2);
        System.out.println("After removing Alex using Key ::" + objMap);

        //get only keys from Hashmap
        //we use keySet() method that extends SET interface because keys can't be duplicate

        Set<Integer> keys = objMap.keySet();

        System.out.println("Retrieving the keys from Hashmap ::" + keys);

        //Retrieve only values
        // values obj will use Collection type because values might contain some duplicate elements in it

        Collection<String> values =  objMap.values();

        System.out.println("Retrieve only values::" + values);

        //Diff methods to Iterate over Map using for Each enhanced loop

       for (Map.Entry<Integer,String> entry : objMap.entrySet()){

           System.out.println("Key ->" + entry.getKey() + " value ->" + entry.getValue());
       }

       //One more method using Iterator

        Set<Map.Entry<Integer,String>> entries = objMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> m = iterator.next();
            System.out.println("Using Iterator Key ->" + m.getKey() + " value Iterator ->" + m.getValue());
        }


        //Using Java 8

        objMap.forEach((K,V) -> {
            System.out.println("Using Java 8");
            System.out.println("K :" + K);
            System.out.println("V :" + V);
        });


    }
}
