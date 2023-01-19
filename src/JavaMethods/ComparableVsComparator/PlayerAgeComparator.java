package JavaMethods.ComparableVsComparator;

import java.util.Comparator;

public class PlayerAgeComparator implements Comparator<Players> {


    @Override
    public int compare(Players o1, Players o2) {
        return Integer.compare(o1.getPlayerAge(), o2.getPlayerAge());
    }


}
