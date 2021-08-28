package StreamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Converting List of elements into flattened List
 */
public class FlatMapExmpl {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(12,25,4));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(34,67,88));

        List<List<Integer>> listofLists = new ArrayList<>(Arrays.asList(l1,l2,l3));

        //Here is the o/p [[1, 2, 3], [12, 25, 4], [34, 67, 88]]
        System.out.println("Log printing listofLists ::" + listofLists);

        List<Integer> listofListsupd = listofLists
                .stream().flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println("Log printing listofListsupd ::"  + listofListsupd);
    }
}
