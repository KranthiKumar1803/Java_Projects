package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * WAP
 * Server 1 returns 5
 * Server 2 returns 4
 * Server 3 returns 5
 * Server 4 returns 6
 * Server 5 returns 2
 * Server 6 returns 4
 */
public class ServersMapping {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "5"); // Server 1 returns 5
        map.put(2, "4"); // Server 2 returns 4
        map.put(3, "5"); // Server 3 returns 5
        map.put(4, "6"); // Server 4 returns 6
        map.put(5, "2"); // Server 5 returns 2
        map.put(6, "4"); // Server 6 returns 4

        System.out.println("Original Map ::" + map);

        //using Java 8 Stream API'S
        Map<String, List<Integer>> reverseMapping = map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(
                                Map.Entry::getKey,
                                Collectors.toList()
                        )));


        System.out.println("Mapping the Values to the Servers :: " + reverseMapping);
    }


}
