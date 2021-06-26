package com.java;

//Static keyword is used for memory management/memory efficient
//The Static object shares the common memory between all the objects
public class StaticDemo {

    private String employeeId;
    private String employeeName;
    private static String companyName = "Mathura";

    public StaticDemo(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public StaticDemo() {

    }

    public void getEmployeeInfo(){

        System.out.println("Here is the employee Information :: "  + employeeId +"::" + employeeName + "::" + companyName);

    }


    public static void main(String[] args) {
        StaticDemo objAlias = new StaticDemo();

        objAlias.employeeId = "007";
        objAlias.employeeName = "Yughandar";

        objAlias.getEmployeeInfo();

    }
}

//class TestStaticDemo{
//    public static void main(String[] args) {
//        StaticDemo objAlias = new StaticDemo();
//
//
//
//
//       // objAlias.getEmployeeInfo();
//
//    }
//}
