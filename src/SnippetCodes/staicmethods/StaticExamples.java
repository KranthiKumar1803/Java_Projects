package SnippetCodes.staicmethods;

public class StaticExamples {

    static int bookid = 101;
    static String bookName = "Java For Beginners and Advance";
    static  double bookVersion = 1.1;

    public static void displayBookShelf(){
        System.out.println("Here is the bookid : " + bookid);
        System.out.println("Here is the bookName : " + bookName);
        System.out.println("Here is the bookVersion : " + bookVersion);
    }

    public void storeShelf(){
        StaticExamples st = new StaticExamples();

        st.displayBookShelf();
    }

    public static void main(String[] args) {
        displayBookShelf();

        System.out.println("Both the Static and Non Static can Be Displayed depending on the logic :" + "/n");


        StaticExamples st = new StaticExamples();
        st.storeShelf();
    }
}
