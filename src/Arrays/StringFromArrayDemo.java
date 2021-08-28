package Arrays;

/*
* Displaying Array of string into single Array
* */

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringFromArrayDemo {

    public static void main(String[] args) {

        String[] str = {"Welcome" ,"To", "Arrays", "Concepts"};
        String str2 = Arrays.stream(str).collect(Collectors.joining(" "));

        System.out.println("Let'see ::" + str2);
    }

}
