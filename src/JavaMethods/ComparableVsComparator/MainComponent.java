package JavaMethods.ComparableVsComparator;

import SnippetCodes.practice.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * COMPARABLE IS USED FOR NATURAL/DEFAULT ORDERING, USES compareTo() METHOD AND IT DOES WITH SINGLE INSTANCE OF THE OBJECT
 * COMPARATOR IS USED CUSTOMIZE THE ORDER AND IT USED compare() METHOD TO COMPARE TWO OBJECTS
 */

public class MainComponent {

    public static void main(String[] args) {

        Players p1 = new Players(21,"Bashir Cameroon", 23);
        Players p2 = new Players(25,"Zamir", 20);
        Players p3 = new Players(29,"Alex Ajish", 22);
        Players p4 = new Players(19,"Hamid", 24);

        List<Players> footBallTeam =  new ArrayList<>();

        footBallTeam.add(p1);
        footBallTeam.add(p2);
        footBallTeam.add(p3);
        footBallTeam.add(p4);

        System.out.println("Displaying the football Team ::" + footBallTeam);
        System.out.println("\n");

        Collections.sort(footBallTeam);
        System.out.println("Sorted ::" + footBallTeam);

        System.out.println("\n");
        PlayerNameComparator playerNameComparator = new PlayerNameComparator();
        //using method reference from Java-8
        Collections.sort(footBallTeam,playerNameComparator::compare);
        System.out.println("Using Method reference of COMPARATOR to compare by name::" + footBallTeam);

        PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();
        Collections.sort(footBallTeam,playerAgeComparator::compare);
        System.out.println("Using Method reference of COMPARATOR to compare by Age::" + footBallTeam);


    }


}
