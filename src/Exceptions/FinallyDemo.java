package Exceptions;

/**
 *Exception occurred in try-block is not handled in catch block: In this case,
 * default handling mechanism is followed. If finally block is present,
 * it will be executed followed by default handling mechanism
 */
public class FinallyDemo {

    public static void main(String[] args) {
        int array1[] =  new int[3];
        try {
            int p = array1[5];
            System.out.println("Since we are trying to access out of index integer value ::" + p);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Catching the exception :; " + arrayIndexOutOfBoundsException);

        }

        finally {
            System.out.println("Please search for a valid INDEX value ::");
        }
    }


}
