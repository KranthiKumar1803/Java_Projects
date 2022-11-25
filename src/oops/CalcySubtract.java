package oops;

public class CalcySubtract extends Calcy{

    @Override
    void display(int a, int b) {
         int c = a - b;
        System.out.println("Subtract ::" + c);

        // just a rain check
        if (c < 0){
            System.out.println("It's a Negative Z");
        }
        else {
            System.out.println("It's a Positive Z");
        }
    }

    public static void main(String[] args) {
        CalcySubtract calcySubtract = new CalcySubtract();

        calcySubtract.display(1,3);
        System.out.println("Method overridden as subtract::");
    }
}
