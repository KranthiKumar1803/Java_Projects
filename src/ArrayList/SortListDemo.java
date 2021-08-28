package ArrayList;
/*
Collection is root interface
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> listObj = new ArrayList<>();

        listObj.add(10);
        listObj.add(500);
        listObj.add(190);
        listObj.add(110);
        listObj.add(3);

       /* List<String> listObj = new ArrayList<>();
        listObj.add("Kranthi");
        listObj.add("Gopal");
        listObj.add("Ajay");
*/
        System.out.println("Basic list ::" +listObj);

        //after sorting
        Collections.sort(listObj);
        System.out.println("After sorting using Collections ::" +listObj);

        //reverse() will display the integers in Descending order
        Collections.reverse(listObj);

        System.out.println("After sorting using reverse() in  Collections ::" +listObj);

    }
}
