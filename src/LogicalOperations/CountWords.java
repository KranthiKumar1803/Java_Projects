package LogicalOperations;

import java.util.HashMap;
import java.util.Map;

/**
 * Counting number of words using split() method of a string
 * here we use collections class called Map interface
 */
public class CountWords {
    public static void main(String[] args) {
        String s1 = "Lets count Count the The Words";

        String[] split = s1.split(" ");
        Map<String,Integer> map = new HashMap<>();
        //first we have to iterate through the loop so we
        //use For loop

        for (int i = 0; i < split.length; i++){
            if (map.containsKey(split[i])){

                int count = map.get(split[i]);
                map.put(split[i], count + 1);

            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println("Here is the Map ::" + map);


    }
}
