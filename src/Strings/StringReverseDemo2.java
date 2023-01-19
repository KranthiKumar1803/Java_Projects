package Strings;

public class StringReverseDemo2 {

    public static String reverseFunction(String input){
        if (input == null){
            throw new IllegalArgumentException("Null Value is not allowed");
        }

        char[] chars = input.toCharArray();

        StringBuilder builder = new StringBuilder();
        // index should start from chars length of the String literal
        for (int i = chars.length - 1; i>= 0; i--){

          //  System.out.println("Inside for loop for characters of a String input " + chars.toString());

            builder.append(chars[i]);

        }

        if (input.equals(builder.toString())){

            System.out.println("just a rain check DOOP ::");
        }
        //ignores the case sensitive
        if (input.equalsIgnoreCase(builder.toString())){

            System.out.println("just a rain check DOOP2 ::");
        }
        return builder.toString();



    }

    public static void main(String[] args) {
        String s = "Kantara";
        String s1 = "MALAYALAM";
        String s2 = "Malayalam";

        System.out.println("Reverse the String ::" + reverseFunction(s));
        System.out.println("Reverse the String ::" + reverseFunction(s1));
        System.out.println("Reverse the String ::" + reverseFunction(s2));
    }
}
