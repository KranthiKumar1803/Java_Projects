package SnippetCodes.forloops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachExample {
    public static void main(String[] args) {
        int array[] = {14, 15, 65, 43, 45, 13};
        int sum = 0;
        // data type is mandatory
        //num is the item of an array to iterate all through it

        List<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(11);
        ls.add(5);
        ls.add(9);

        ls.forEach(num->System.out.println("here is the forEach ::" + num));

//        ls.forEach(k -> {
//            k += k;
//            System.out.println("Here is the add of k numbers in the list :" + k);
//        });

        ls = ls.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorted by stream api ::" + ls);
        for(int num : array){

            sum += num;

            System.out.println("Here is the array of number :" + sum);

        }
    }
}
