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

    public void displayStudentinfo(){

        String info = "Here is the student info ::" ;

        System.out.println(info + id + "::" + name + "::" + grade + "::" + campusCode);


    }

    public static void main(String[] args) {
        StudentConstructor objStudent = new StudentConstructor();

        StudentConstructor objStudentwithCampusCode = new StudentConstructor();

        objStudent.id = 1;
        objStudent.name = "kranthi";
        objStudent.grade = "A+";

        objStudent.displayStudentinfo();

        objStudentwithCampusCode.id = 2;
        objStudentwithCampusCode.name = "Sai";
        objStudentwithCampusCode.grade ="A";
        objStudentwithCampusCode.campusCode = "Main Campus";

        objStudentwithCampusCode.displayStudentinfo();

    }
}
