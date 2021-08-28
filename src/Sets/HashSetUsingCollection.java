package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetUsingCollection {
    public static void main(String[] args) {

        //first five even numbers
        Set<Integer> firstFiveEven = new HashSet<>();
        firstFiveEven.add(2);
        firstFiveEven.add(4);
        firstFiveEven.add(6);
        firstFiveEven.add(8);
        firstFiveEven.add(10);

        System.out.println(firstFiveEven);

        Set<Integer> totalEvenNumbers = new HashSet<>(firstFiveEven);

        List<Integer> nextFiveEvenNumbers = new ArrayList<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        totalEvenNumbers.addAll(nextFiveEvenNumbers);

        System.out.println(totalEvenNumbers);
    }
}
