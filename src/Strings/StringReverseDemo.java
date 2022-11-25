package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringReverseDemo {
    public static void main(String[] args) {

        List<String> mockList = new ArrayList<>();

        mockList.add("Learn to be Success");
        mockList.add("CODE");
        mockList.add("BUFFER");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder  = stringBuilder.append(mockList);

       System.out.println("Revesre the Strings List ::" + stringBuilder.reverse());

       StringBuffer sf = new StringBuffer();

       sf.append(mockList);

       System.out.println("Using StringBuffer :: " + sf.reverse());

        System.out.println("Using StringBuffer to se capacity():: " + sf.capacity());


    }
}
