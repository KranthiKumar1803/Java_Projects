package SearchingSorting;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //Initialize the fields
        int num;
        int item;
        int counter;
        int array[];

        //take the input from the user
        Scanner input = new Scanner(System.in);
        
        System.out.println("User enters the input :"  );
        num = input.nextInt();
        System.out.println("Here is the number user entered :" + num);
        array = new int[num];

        System.out.println("Here is the list of numbers :" + num);

        //loop over the array of values
        for(counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();
            System.out.println("Enter the search value :");
            item = input.nextInt();

        for(counter = 0; counter < num; counter++){
            if(array[counter] == item){

                System.out.println(item + " item matches the counter here @:" + (counter));
                break;
            }

        }
        if(counter == num){
            System.out.println(item + " : Item doesn't match with the mentioned array : " );

        }
        
    }
}
