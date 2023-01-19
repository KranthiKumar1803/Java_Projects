package basics.DateAPIs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.SimpleFormatter;

public class SimpleDates {

    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Printing Date ::" + date);

//        SimpleFormatter simpleFormatter = new SimpleFormatter("");
//        simpleFormatter.format();

        LocalTime localTime = LocalTime.now();
        LocalDate localDateEpoch = LocalDate.EPOCH;
        LocalDate localDate = LocalDate.now();

        System.out.println("Using LocalTime API ::" + localTime);

        System.out.println("Using LocalDate Epoch func API ::" + localDateEpoch);

        System.out.println("Using LocalDate API ::" + localDate);

        if (localDate.isEqual(localDate)){

            System.out.println("hurray !!!! Thanks Giving date Arrived");
        }
    }
}
