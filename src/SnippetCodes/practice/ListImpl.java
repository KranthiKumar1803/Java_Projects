package SnippetCodes.practice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        List<String> listttt = new ArrayList<String>();

        listttt.add(0, "Kittayaa");
        listttt.add(1, "Kittayaa");
        listttt.add(2, "Seenu");
        listttt.add(3, "Venky");
        listttt.add(4, "Sai");
        Iterator x = listttt.iterator();
        System.out.println("Here is the listttt.iterator(); : " + x.hasNext());
        if (x.hasNext()) {
            System.out.println("Iterator checking is done and it throws True :");
            listttt.add("Monu");
            listttt.lastIndexOf(x);
        }
        System.out.println("wow : " + listttt.toString());

//        if(listttt.add("kanna")){
//            String noun = listttt.toString();
//
//            System.out.println("Look at this :" + noun);
//
//        }
        if (listttt.contains("Kittayaa")) {
            System.out.println("I don't think it's gonna execute :" + listttt);
            //System.out.println("Streaming :" + listttt.stream().count());
            System.out.println("Streaming :" + listttt.stream().skip(3));


        } else {
            System.out.println("Asusual List  :" + listttt);
        }

    }


}
