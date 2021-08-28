package StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Converting Arrays into List and flattening the data using .flatmap
 */
public class FlatMapExmpl2 {

    public static void main(String[] args) {
        String[][] dataArray = new String[][]{{"a", "b"},{"c", "d"},{"e", "f"}};

        int c =dataArray.length;
        System.out.println("Checking the length of the Array ::" + c);

        List<String> resultSet = Arrays.stream(dataArray)
                .flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

        System.out.println("Here is the flattened data ::" + resultSet);
    }
}
