package ArrayList;

/**
 * checking .isEmpty() -> boolean type
 * .size() return the size of the array
 * .add adds the elements
 * .set modifies the element at particular index
 * .remove(index)
 * .remove(object) -> object of specific type
 * removeAll(c); c =  subPrograms it removes the collection mentioned with O(n^2) takes a while to remove data
 * .clear(); removes everything from the list and display empty list [] it resets the List
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArraylistAccessandMethods {

    public static void main(String[] args) {
        List<String> arrayListObj = new ArrayList<>();

        //isEmpty() checks if array list if empty or not if empty it throws true in the console
        System.out.println("Is arrayListObj empty let's check ::" +arrayListObj.isEmpty());

        arrayListObj.add("Java");
        arrayListObj.add("Python");
        arrayListObj.add("Ruby");
        arrayListObj.add("Kotlin");
        arrayListObj.add("C++");

        System.out.println("Here is the programs list ::" + arrayListObj);
        System.out.println("Here is the programs list and it's size::" + arrayListObj.size());

        System.out.println("Best Language in the programs list ::" + arrayListObj.get(0));

        //Lets modify the list

        arrayListObj.set(2,"Go");

        System.out.println("Modified List :: " + arrayListObj );


        System.out.println("Modified List using .remove() at index 2:: " + arrayListObj.remove(2) );

        System.out.println("Modified List after removing Java :: " + arrayListObj );

        arrayListObj.remove("Kotlin");
        System.out.println("Modified List after removing Kotlin using .remove(object) :: " + arrayListObj );

        //lets use removeAll

        List<String> subPrograms = new ArrayList<>();
        subPrograms.add("Python");
        subPrograms.add("Ruby");
        subPrograms.add("C++");

        arrayListObj.removeAll(subPrograms);


        System.out.println("List modified with removeAll subPrograms:: " + arrayListObj);

        arrayListObj.iterator();

        System.out.println("List modified with iterator :: " + arrayListObj);

        arrayListObj.clear();

        System.out.println("List modified with .clear() :: " + arrayListObj);


    }


}
