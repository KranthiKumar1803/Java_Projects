package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * SET doesn't allow the duplicates at all
 * HashSet
 * LinkedHashSet
 * TreeSet
 */
public class DifferentSets {
    public static void main(String[] args) {
        //Implementing HashSet
        Set<String> setInstanceObject =  new HashSet<>();
        setInstanceObject.add("A");
        setInstanceObject.add("A");
        setInstanceObject.add("C");
        setInstanceObject.add("D");
        setInstanceObject.add("E");

        System.out.println("Result ::" + setInstanceObject);

        //Implementing LinkedHashSet
        Set<String> setInstanceObject2 = new LinkedHashSet<>();
        setInstanceObject2.add("A");
        setInstanceObject2.add("C");
        setInstanceObject2.add("A");
        setInstanceObject2.add("D");
        setInstanceObject2.add("E");

        System.out.println("Result ::" + setInstanceObject2);

        ////Implementing TreeSet
        Set<String> setInstanceObject3 =  new TreeSet<>();

        setInstanceObject3.add("A");
        setInstanceObject3.add("B");
        setInstanceObject3.add("A");
        setInstanceObject3.add("D");
        setInstanceObject3.add("E");

        System.out.println("Result ::" + setInstanceObject3);

    }
}
