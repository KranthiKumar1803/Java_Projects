package ArrayList;

import java.util.LinkedList;

/**
 * LinkedList uses/extends List and Deque interfaces
 * add()
 * add(index, element)
 * addFirst()
 * addLast()
 */

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Oranges");
        fruits.add("Mangoes");
        fruits.add("Apples");
        fruits.add("Bananas");

        System.out.println("Original fruits basket ::" + fruits);

        //adding at index 3
        fruits.add(3,"cherry");
        System.out.println("Original fruits basket ::" + fruits);

        //adding at first of the linked list
        fruits.addFirst("blueberry");

        System.out.println("Original fruits basket ::" + fruits);

        //adding at last

        fruits.addLast("Sapota");
        System.out.println("using add last ::" + fruits);

        fruits.removeFirst();
        System.out.println("Removing first element from linked list  ::" + fruits);


        /**
         * Retrieving the elements from LinkedList
         * getFirst()
         * getLast()
         * get(index)
         */

        String firstE = fruits.getFirst();

        System.out.println("Here is the first element in the linkedlist ::" + firstE);

        String lastE = fruits.getLast();
        System.out.println("Here is the last element in the linkedlist ::" + lastE);

        String specElement = fruits.get(2);
        System.out.println("Here is the specific element in the linkedlist ::" + specElement);

        for(String fruit : fruits){
            System.out.println("Using for each loop ::" + fruit);

        }

        /**
         * Removing elements from linkedlist
         * removeFirst()
         * removeLast()
         * remove at the first occurence of the linkedlist
         */

        fruits.removeFirst();

        System.out.println("remove first element in the linkedlist ::" + fruits);

        fruits.removeLast();

        System.out.println("remove last element in the linkedlist::" + fruits);

        fruits.remove(3);
        System.out.println("remove element @index 3 in the linkedlist::" + fruits);


    }
}
