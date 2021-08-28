package SearchingSorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Using Java 8 Streams
 */

public class ValidateEvenNumbers {


    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(4);
        num.add(6);
        num.add(10);
        num.add(33);
        num.add(77);

        num.stream().filter((n -> n % 2 == 0)).forEach(System.out::println);

    }

}
