package SnippetCodes.practice;


public class Numbers {
    public static void main(String[] args) {
        //addSum(2,4);
        System.out.print(Numbers.addSum(2,4) );
        System.out.print(Numbers.multiplyNum(4,4));
    }

    public static boolean addSum(int a, int b){
         int c = a + b;

        System.out.print("Sum of the int numbers : " + c + " ");

        return true;
    }

    public static boolean multiplyNum(int a, int b){

        int c = a * b;

        System.out.print("Multiply of the int numbers : " + c + " ");

         return true;
    }

}
