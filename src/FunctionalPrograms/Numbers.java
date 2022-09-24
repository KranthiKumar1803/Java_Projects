package FunctionalPrograms;


@FunctionalInterface
public interface Numbers {

    int expectNumber(int n);

    default void expectName(String name) {

        return;
    }
}
