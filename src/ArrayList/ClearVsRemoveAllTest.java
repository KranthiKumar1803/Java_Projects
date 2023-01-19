package ArrayList;

import java.util.ArrayList;

public class ClearVsRemoveAllTest {

    public static final int SIZE = 1000;

    public static void main(String[] args) {
        ArrayList numbers =  new ArrayList(SIZE);
        ArrayList integers = new ArrayList(SIZE);

        for (int i = 0; i <= SIZE; i++){
           // numbers = numbers[i]; //fools code
            numbers.add(new Integer[i]);
            integers.add(new Integer[i]);

        }

        Long startTime = System.nanoTime();
        System.out.println("Using clear() method taking time ");
        numbers.clear();
        Long timeElapsed = System.nanoTime() - startTime;
        System.out.println("Time takes for the clear method to implement 100000 size of ArrayList --> :: " + timeElapsed);


        System.out.println("Using clear() method taking time ");
        integers.clear();
        Long timeElapsed2 = System.nanoTime() - startTime;
        System.out.println("Time takes for the clear method to implement 100000 size of ArrayList --> :: " + timeElapsed2);


    }


}
