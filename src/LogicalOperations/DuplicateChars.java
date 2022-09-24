package LogicalOperations;

/**
 * In this class we are going to check the duplicate characters in a String
 */
public class DuplicateChars {
    public static void main(String[] args) {
        int count = 0;
        String str = new String("ABCCD");
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are at the Index ::");
        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length(); j++){
                if (chars[i] == chars[j]){
                    System.out.println("->" + j);
                    System.out.println("lets check the string :: " + str.substring(i,j));
                    count++;
                    break;
                }
            }
        }
    }
}
