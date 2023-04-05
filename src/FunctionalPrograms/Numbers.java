package FunctionalPrograms;


@FunctionalInterface
public interface Numbers {
    int factorialFunction(int n);

    default int expectNumber(int i){

        return i + i;
    }

    default String stringReverseLogic(String n){

        return n;
    }

}
