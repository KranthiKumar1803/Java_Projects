package oops;

/**
 * understanding method overriding
 * final and static methods can't be overridden if tried so will get Compile time exceptions/errors
 * The overriding method must have the same return type (or subtype) as that of the overridden method (like int display(), float display() will not compile)
 */
public class Calcy {

    void display(int a, int b) {

        int c = a + b;

        System.out.println("Sum ::" + c);

    }


    public static void main(String[] args) {
        Calcy calcy = new Calcy();
        calcy.display(2, 6);

    }


}







