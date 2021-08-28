package StreamAPI;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmpl {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("1","David");
        map.put("2","Mallik");
        map.put("3","Ikka");
        map.put("4","ACP");

        System.out.println("Let's see" + map);

        System.out.println("Let's see ::" + map.get("2"));

        System.out.println("Let's replace ::" + map.replace("1","Sulaiman"));

     // map.putAll(map);
String x = "MAGIC";

StringBuilder sb = new StringBuilder();

sb.append(x);
sb.reverse();

System.out.println("Here is the reversed ::" + sb);



    }
}
