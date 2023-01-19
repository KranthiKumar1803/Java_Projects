package SnippetCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortByHashMap {
    public static void main(String[] args) {
        HashMap<Character, Integer> mao = new HashMap<Character, Integer>();

        String str1 = "LearnCoding";

        char[] chars = str1.toCharArray();

        //Doop
        //System.out.println("Printing the characters array :: " + chars);

        for (char c : chars){
            if (mao.containsKey(c)){
                mao.put(c,mao.get(c) + 1 );
            }
            else {
                mao.put(c, 1);
            }

        }

        System.out.println("Printing the Map :: " + mao);

        Iterator iterator = mao.entrySet().iterator();

        Map.Entry mapEntry = (Map.Entry) iterator.next();

        System.out.println("Getting Key ::" + mapEntry.getKey() + " ----"+ "Getting Value ::" +mapEntry.getValue());


    }
}
