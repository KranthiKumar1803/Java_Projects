import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StudentConstructor {

    private String campusCode;
    private String name;
    private int id;
    private String grade;

    //Default Constructor
    //Paramaeterized Constructor


    public StudentConstructor(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public StudentConstructor(String name, int id, String grade, String campusCode) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.campusCode = campusCode;
    }

    public StudentConstructor() {

    }

    public void displayStudentinfo(String info){

         info = "Here is the student info ::" ;

        System.out.println(info + id + "::" + name + "::" + grade + "::" + campusCode);


    }




    public static void main(String[] args) {
        StudentConstructor objStudent = new StudentConstructor();

        StudentConstructor objStudentwithCampusCode = new StudentConstructor();

      /* List<StudentConstructor> streamthing = new ArrayList<>(
               Arrays.asList( new StudentConstructor("Chaitu", 3, "A", "Delhi Campus")),
                                new StudentConstructor("Chintu", 1, "A+", "Mumbai Campus"),
                                    new StudentConstructor("Anil", 2, "A", "Rajasthan Campus")

                            );*/

        List<StudentConstructor> streamthing = Arrays.asList(new StudentConstructor("Chaitu", 3, "A", "Delhi Campus"),
                new StudentConstructor("Chintu", 1, "A+", "Mumbai Campus"),
                new StudentConstructor("Anil", 2, "A", "Rajasthan Campus")
        );
        objStudent.id = 1;
        objStudent.name = "kranthi";
        objStudent.grade = "A+";
        objStudent.campusCode = "Pune Campus";

        objStudent.displayStudentinfo("x");

        objStudentwithCampusCode.id = 2;
        objStudentwithCampusCode.name = "Sai";
        objStudentwithCampusCode.grade ="A";
        objStudentwithCampusCode.campusCode = "Main Campus";

        objStudentwithCampusCode.displayStudentinfo("x");

        streamthing.stream().
                forEach(n -> System.out.println("Trying the Stream forEach Operation ::" + n.id + ":" + n.grade + ":" + n.name + ":" + n.campusCode));



    }
}
