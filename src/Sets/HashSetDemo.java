package Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * HastSet internally implements Hashmap
 * It extends Set interface
 * HashSet cannot contains duplicate values (if contains it will override the previous duplicate value and display one result)
 * HashSet allows only one null value
 * HashSet inserts elements in an unordered collection
 * HashSet is not Thread safe
 */


public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> objSet = new HashSet<>();

        //checking for alphabetic ordering
        objSet.add("Nikhil");
        objSet.add("Akhil");
        objSet.add("xxx");

        System.out.println("Result of checking for alphabetic ordering ::" + objSet);

        Set<String> objSet1 = new HashSet<>();
        objSet1.add(null);
        objSet1.add(null);
        objSet1.add(null);

        System.out.println("Result of multiple null's::" + objSet1);

        Set<Integer> objSet2 = new HashSet<>();
        objSet2.add(9);
        objSet2.add(4);
        objSet2.add(6);
        objSet2.add(1);

        System.out.println("Result of collection  ::" + objSet2);

        /**
         * Makes the collection type synchronized to access a multi thread level.
         * synchronizedSet()
         * synchronizedList()
         * synchronizedMap()
         */
        Collections.synchronizedSet( objSet2);
        System.out.println("synchronizedSet ::" + objSet2);
        Collections.synchronizedSet(objSet1);
        Collections.synchronizedSet(objSet2);



    }
}
