package basics.forloops;

public class IteratorLoop {

    public static void main(String[] args) {
        char [] vowels = {'a', 'c', 'g', 'e', 'w', 'o', 'b', 'q', 'p'};

        for (char v : vowels){
            System.out.println("Here is the Iterated list of char's :" + v );

        }
    }
}
