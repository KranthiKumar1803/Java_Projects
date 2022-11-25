package basics;



import basics.staicmethods.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Database {

    public static List<Student> getAll() {
        return Stream.of(
                new Student(100, "Krishna", "Kk@gmail.com", Arrays.asList("2345678","34567890")),
                new Student(101, "Karna", "Pk@gmail.com", Arrays.asList("2345678","34567890")),
                new Student(102, "Bheeshma", "SAk@gmail.com", Arrays.asList("2345678","34567890")),
                new Student(103, "Sidda", "gk@gmail.com", Arrays.asList("2345678","34567890"))
        ).collect(Collectors.toList());
    }


}
