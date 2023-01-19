package SnippetCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// TODO: 11/23/22
public class SortByComparator {
    public static void main(String[] args) {
        List<Developers> developersList = getDevelopers();



       System.out.println("Grabbing the list of developers {} :" + developersList.size());

        Collections.sort(developersList, new Comparator<Developers>() {
            @Override
            public int compare(Developers o1, Developers o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("After using Comparator ::" + developersList );

        //using lambda's

       developersList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()) );

        System.out.println("Lambda sorted :: " + developersList);

        //just looping through the code
        int n = developersList.size();
        for (int i = 0; i < n; i++){
            System.out.println("Printing in the forLoop :: " + i);
        }

    }

    private static List<Developers> getDevelopers() {

        List<Developers> devList = new ArrayList<Developers>();

        devList.add(new Developers("Kiran", 1, "3000$"));
        devList.add(new Developers("Gopal", 2, "4000$"));
        devList.add(new Developers("Ajay", 3, "5000$"));
        devList.add(new Developers("Sai", 4, "6000$"));

        return devList;

    }

}
