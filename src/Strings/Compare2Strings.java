package Strings;

public class Compare2Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";

        //equals() method check the content of the string/data - it's case sensitive
        boolean result = s1.equals(s2);

        //equalsIgnoreCase() ignores the case senstiveness of the string/data
        boolean result2 = s1.equalsIgnoreCase(s2);

        System.out.println("Lets see the result ::" + result);
        System.out.println("Lets see the result ::" + result2);
    }
}
