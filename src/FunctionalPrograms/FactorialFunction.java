package FunctionalPrograms;

public class FactorialFunction {

    public static void main(String[] args) {

        Numbers factorialLogic = (n) -> {

            int result = 1;

            for (int i = 1; i <= n; i++)

                result = result * i;

                return result;


        };

        System.out.println("Print factorialLogic ::" + factorialLogic.factorialFunction(6) );

    }
}
