package basics.practice;

public class ArraysMagic {

    public static void main(String[] args) {
        // size is Set to 10
        int Array[] =  new int[10];

        for (int i = 5; i < Array.length; i++){
            Array[i] = i + 1;
            System.out.println("Here is the Array  : " + (Array[i]));
        }

    }
}
