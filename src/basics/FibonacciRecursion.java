package basics;


// TODO: 11/24/22
public class FibonacciRecursion {

   public static int fibonacciFun(int n){

       if (n <= 1){

           return n;
       }

       return fibonacciFun(n - 1) + fibonacciFun(n - 2);
   }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Getting the Fibonacci series for this number " + n);
        System.out.println("Implementing Fibonacci ::" + fibonacciFun(n));

        String str = "   we are the best fam  ";

        System.out.println("Normal str ::" + str);

        System.out.println("using Strip() method of String ::" + str.strip());
    }

}
