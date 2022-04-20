package StreamAPI;
/**
 * Map, filter and Sorted are the intermediate operations
 * forEach, collect and reduce are the Treminal Operations
 */

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Likith", "Sai", "Lalith", "Rajesh","Limesh", "Amith", "Ben");
        //sorted
        namesList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Displayinmg names list :: + " + namesList);
        //filter()
        List<String> result =  namesList.stream()
                .filter(s->s.startsWith("L"))
                .collect(Collectors.toList());
        System.out.println("filter().startsWith Implementing" + result);
        //reduce

        List numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);



    }
}
