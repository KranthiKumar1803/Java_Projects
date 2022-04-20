package StreamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Streams are new features that got added to Java 8
 * 2 types of operations it performs Terminal and Intremediate operations
 *
 */


public class StreamOps {


    public static void main(String[] args) {
        List<Integer> sampleList = new ArrayList<>();
        sampleList.add(1);
        sampleList.add(2);
        sampleList.add(3);
        sampleList.add(4);

        List numbers = Arrays.asList(1,7,5,3,9,12);

       List streamOperation = (List) numbers.stream().sorted().collect(Collectors.toList());

       System.out.println("Here is the sorted() method ::" + streamOperation);

       List<String> names = new ArrayList<>();

       names.add("Krishna");
       names.add("Kanna");
        names.add("Yudhisthir");
        names.add("kittu");
        int count = 0;
        names.stream().forEach(n->{
           // count++;

            System.out.println("List of names ::" + n);
        });
        count++;

        List kListofNames = names.stream().filter(n-> n.startsWith("K")).collect(Collectors.toList());

        System.out.println("Using filter() method of Streams  ::" + kListofNames);




    }
}
