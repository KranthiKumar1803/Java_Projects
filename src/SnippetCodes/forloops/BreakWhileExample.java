package SnippetCodes.forloops;

public class BreakWhileExample {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 5){
            if(i == 3){
                System.out.println("testing the if loop :" + i);

                i++;

                break;
            }
            System.out.println("let if it's looping and working");
                i++;
        }


    }
}
