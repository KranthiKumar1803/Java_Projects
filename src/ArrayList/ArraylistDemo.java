package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Arraylist allows nulls and duplicates
 * It is not synchronized at all so multiple thread can't access it at a time
 *it extends LIST and list interface internally extends COLLECTION interface
 */

public class ArraylistDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        //ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("jack fruit");
        fruits.add("banana");

        System.out.println("Output ::" + fruits);

        System.out.println("Output get()::" + fruits.get(2));


       /* if (fruits.contains("banana")){
            System.out.println("In the If loop::" );
        }

        for (int i = 0; i <fruits.size(); i++){
            System.out.println("In the for loop::" + fruits.get(i));
        }*/
    }
}
