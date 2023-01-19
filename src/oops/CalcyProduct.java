package oops;

/**
 * Method overriding
 * Overriding is only possible in the respective child classes
 * here method is overridden from sum to Product
 */
public class CalcyProduct extends Calcy{

    @Override
    void display(int a, int b) {
       // super.display(a, b);

        int c = a * b;

        System.out.println("Method overridden ::");
        System.out.println("Product ::" + c);
    }

    public static void main(String[] args) {
        CalcyProduct calcyProduct = new CalcyProduct();

        calcyProduct.display(2,3);
        System.out.println("O/p ::");
    }
}
