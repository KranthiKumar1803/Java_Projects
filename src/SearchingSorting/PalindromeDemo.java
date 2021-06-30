package SearchingSorting;


/*
Checking the Palindrome logic for a String Variable
 */
public class PalindromeDemo {

    public static void main(String[] args) {

        String original = "mom";
        String reverse = "";
       int length = original.length();

       System.out.println("Just to verify the original length ::: " + length);

       //Here goes the logic
       for(int i = length - 1; i >= 0; i--){
           reverse = reverse + original.charAt(i);

           System.out.println("Just to verify the reverse var ::: " + reverse);
       }
       // if we are using "==" the o/p is "This is not the Palindrome as expected"
        //Need to verify it
       if (original.equals(reverse)){
           System.out.println("This is the Palindrome as expected");
       }
       else {
           System.out.println("This is not the Palindrome as expected");
       }

    }

}
