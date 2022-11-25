package basics.practice;

import basics.Database;
import basics.staicmethods.Student;

import java.util.List;

public class ForEachDemo {

//  String obj = stud.add(1,"Kanna", "kk@gmai;.com", Arrays.asList("234567", "9876543"));



    public static void main(String[] args) {
        List<basics.staicmethods.Student> stud = Database.getAll();
      //  String obj = stud.toString();
        System.out.println("Lets seee the list of Objects available in the Database  :" + stud);

        if(stud !=null && !stud.isEmpty()){
            System.out.println("List is not empty :" + stud);
            for (Student s :stud) {

                System.out.println("Here is the for each loop :" +s.getId());

                System.out.println("Here is the for each loop :" +s.getName());

                System.out.println("Here is the for each loop :" +s.getEmailId());

                System.out.println("Here is the for each loop :" +s.getPhoneNumbers());


            }


        }

    }
}
