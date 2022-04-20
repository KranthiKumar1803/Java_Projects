package Strings;

/**
 * Delimiters can be , or | or & or any other special character or empty spaces present in the String
 * We will write java program to split the string at:
 * empty spaces
 * &
 * @
 * %
 * &
 * %
 */
public class SplitStringDemo {

    //split at &
    public static void splitAtAnd(String str){
        String[] strArrays = str.split("&");

        for (String s: strArrays) {
            System.out.println("using the splitAtAnd() method :: " + s);
        }
    }
    public static void main(String[] args) {
        String str = "I Love Java  & Its Programming % C Programming @ Strings too";
        // Don't do this //s
        String[] strArray = str.split("\\s");

        for (String s : strArray) {
            System.out.println("Displaying the strings using split() :: " + s);
        }

        String s2 = "Love & Romance & Kiss";
        //it's a static method so no need to uinitialize the class name at all
        splitAtAnd(s2);

    }
}
