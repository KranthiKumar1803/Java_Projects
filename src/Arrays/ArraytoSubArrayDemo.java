package Arrays;

import java.util.Arrays;

public class ArraytoSubArrayDemo {

    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 5};
        int [] subArray = Arrays.copyOfRange(array,0,4);
      //  int [] subArray = Arrays.copyOf(array,6);


        for(int i = 0; i < array.length; i++){
            System.out.println("Here is the Array :::" +array[i]);
        }

        for (int i = 0; i < subArray.length; i++)

        System.out.println("Here is the Sub Array :::" + subArray[i]);

    }
}
