package ArrayList;

/**
 * for loop
 * enhanced for each loop
 * Using Iterator
 * Using Iterator in while loop
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOverList {

    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Hibernate");
        courses.add("Spring");
        courses.add("SQL");

        //basic for loop
        for (int i = 0; i <courses.size(); i++){
            System.out.println("Lets see in for loop::" + courses.get(i));

        }

        //Enhanced for Each loop

        for (String c : courses){
            System.out.println("Using for each loop ::" + c);
        }

        //using iterator

        for (Iterator i = courses.iterator(); i.hasNext();){

            String course = (String) i.next();
            System.out.println("Using Iterator ::" + course);

        }
        //Iterator with while loop
        Iterator it = courses.iterator();
        while (it.hasNext()){
            String course = (String) it.next();
            System.out.println("In the while loop ::" + course);
        }

        //using java 8 stream + lambda
        courses.stream().forEach(c -> {
            System.out.println("Using java 8 stream + lambda ::" + c);
        });

        //using java 8 forEach
        courses.forEach(course -> {
            System.out.println("Using Java 8 forEach ::" + course);
        });
    }

}
