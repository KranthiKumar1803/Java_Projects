package ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Passing on collection of objects from one collection to the another
 */

public class ArraylistUsingCollection {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        firstList.add(10);
        firstList.add(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);
        firstList.add(60);

       // System.out.println(" firstList of number ::" +  firstList);

        List<Integer> secondList = new ArrayList<>(firstList);

        System.out.println(" secondList of number ::" +  secondList);
        List<Integer> thirdList = new ArrayList<>();
        thirdList.add(70);
        thirdList.add(80);
        thirdList.add(90);
        thirdList.add(100);
        thirdList.add(101);

        secondList.addAll(thirdList);

        System.out.println(" Third List of number ::" +  secondList);



    }
}
