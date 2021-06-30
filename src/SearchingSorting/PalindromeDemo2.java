package SearchingSorting;

public class PalindromeDemo2 {

    public static void main(String[] args) {
        int sum = 0;
        int temp,r;
        int n = 454;

        temp = n;

        while (n > 0){
            r = n%10;
            sum = (sum * 10) + r;
            n = n/10;
        }

        if(temp == sum){
            System.out.println("This is the Palindrome as expected ::: " + temp +"::matching with::" + sum);
        }
        else {
            System.out.println("This is not the Palindrome as expected ::: " );
        }
    }
}
