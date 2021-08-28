package Strings;

public class StringReverseDemo {
    public static void main(String[] args) {
        String s = "Learn to be Success";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder  = stringBuilder.append(s);
        System.out.println("Revesre the String ::" + stringBuilder.reverse());

        StringBuffer sbf = new StringBuffer();
        sbf = sbf.append(s);
      //  System.out.println("Revesre the String ::" + sbf.reverse());
        System.out.println("Deleting at particular char Type on a  String ::" + sbf.delete(2,14));

        System.out.println("Revesre the String ::" + sbf.capacity());
      //  System.out.println("Revesre the String ::" + sbf.substring(6,9));
        System.out.println("Revesre the String ::" + sbf);
    }
}
