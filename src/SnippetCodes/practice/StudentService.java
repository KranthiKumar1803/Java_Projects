package SnippetCodes.practice;

import java.util.Scanner;

public class StudentService {

    public static String getAllDetails(){
        Student obj = new Student();
        Scanner sc = new Scanner(System.in);

        obj.setId(202);
        obj.setName("Kanna");
        obj.setEmailId("kk@gmail.com");
        obj.setPhone("9949013814");

        System.out.println("Student hits the ID :" );
        obj.id = sc.nextInt();
//        System.out.println("Student hits the Name (Kind of Validation) Starting with K: " + obj.name);
//        obj.name = sc.nextLine();


        try {
            if(obj.getId() == 202 && obj.getName().startsWith("K")) {

                System.out.println("Student entered :"  + obj.id);
                System.out.println("Student entered the name Starting with K :"  + obj.name);


                System.out.println("Checking for the Student Kanna   : " + obj);

                return getAllDetails();
            }
            /*else {
                String  foul = "Student entered the ID which needs to be Authenticated :";
                return foul;
            }*/
        } catch (Exception e) {
            System.out.println("Student entered wrong ID Here we catch the exceptions  :"  + e);
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {

        System.out.println("Here we are calling the static method :" + getAllDetails());


    }
}
