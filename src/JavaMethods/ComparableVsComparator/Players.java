package JavaMethods.ComparableVsComparator;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Players implements Comparable<Players>{

    private int rank;
    private String playerName;
    private int playerAge;


    @Override
    public int compareTo(Players o) {

        return Integer.compare(getRank(),o.getRank());
    }


}
