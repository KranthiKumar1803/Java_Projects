package basics.practice;

import basics.Database;
import basics.staicmethods.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDiff {

    public static void main(String[] args) {

        List<Student> studss = Database.getAll();

        List<String> studsEmails = studss.stream().map(studs -> studs.getEmailId()).collect(Collectors.toList());

        System.out.println("Here we go with the mail list :" +studsEmails);

//        List<String> studPhones = studss.stream().flatMap(stphones -> stphones.getPhoneNumbers().stream()).collect(Collectors.toList());
//        System.out.println("Here we go with the Phones list :" +studPhones);

        List<String> studNames = studss.stream().map(stph -> stph.getName()).collect(Collectors.toList());
        System.out.println("Here we go with the Phones list :" +studNames);

        List<Integer> studIDs = studss.stream().map(stid -> stid.getId()).collect(Collectors.toList());
        System.out.println("Here we go with the Phones list :" +studIDs);

        List<List<String>> studPhones2 = studss.stream().map(stph -> stph.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println("Here we go with the Phones list :" +studPhones2);

        //Flattening the data
        List<String> studPhones2fm = studss.stream().flatMap(stph -> stph.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println("Here we go with the Phones list :" +studPhones2fm);


    }

}
