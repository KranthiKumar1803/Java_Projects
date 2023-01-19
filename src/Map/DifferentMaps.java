package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * HashMap : Order will not be guaranteed
 * Allows one Null key and Many null values
 * It will not allow the duplicates, if only the key is duplicate then value be overridden.
 *
 */


public class DifferentMaps {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer,String> mapObject = new HashMap<>();

        mapObject.put(1,"Sunil");
        mapObject.put(2,"AMith");
        mapObject.put(3,"Kamal");
        mapObject.put(4,"Rajini");
        mapObject.put(5,"Farooq");
        //Map doesn't have duplicate keys but it allows n number same of values
        //Result :: {1=Sunil, 2=AMith, 3=AMith, 4=AMith, 5=AMith}

        System.out.println("Result :: " + mapObject);

        /**
         * Insertion order is certain
         * It will not allow the duplicates, if only the key is duplicate then value be overridden.
         * Allows one Null key and Many null values
         */

        Map<Integer,String> mapObject2 = new LinkedHashMap<>();

        mapObject2.put(0,"Lalith");
        mapObject2.put(1,"Anil");
        mapObject2.put(2,"Suman");

        System.out.println("Result mapObject2 :: " + mapObject2);

        for (Map.Entry<Integer,String> entryObject: mapObject2.entrySet()
             ) {
            System.out.println("Here is the entrySet() method ::" + entryObject);

            System.out.println("Let's see the keys ::" +entryObject.getKey());
            //Grabs the object depends on the key(s)
            //Let's see the keys ::1
            //Let's grab the object ::Anil
            if (entryObject.getKey() == 1){

                System.out.println("Let's grab the object ::" +entryObject.getValue());

                if (entryObject.getValue().equalsIgnoreCase("anil")){

                    System.out.println("Friend stay's in Texas as of now :: ");

                }

            }

        }


    }
}
