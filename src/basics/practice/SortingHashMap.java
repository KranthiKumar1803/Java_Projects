package basics.practice;

import java.util.*;

// TODO: 11/24/22  

public class SortingHashMap {

    public static Map sortingByValues(Map scores){

        Map sorted = new LinkedHashMap();
        // EntrySet and Entry, EnrtyList

        Set entrySet = scores.entrySet();
        System.out.println("Printing entrySet ::" + entrySet);

        List entryList = new ArrayList<>(entrySet);

        System.out.println("Printing entryList ::" + entryList);
/*
        entryList.sort((o1, o2) -> o1.getValue.compareTo(o2.getValue));

        // for(type var : array) Syntaxxxx
        for (Entry e:
                entryList) {
            sorted.put(e.getKey, e.getValue);
        }*/

            return sorted;

    }

    public static void main(String[] args) {

        Map scores = new HashMap();
        // Map is Unordered
        scores.put("Kian", "35");
        scores.put("Thaman", "45");
        scores.put("Nirvan", "25");
        scores.put("Ayansh", "75");
        scores.put("Kiran", "95");

        System.out.println("Before Sorting the Map values :: " + scores);

    }
}
