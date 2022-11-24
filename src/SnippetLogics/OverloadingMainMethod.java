package SnippetLogics;

// can we overload main method ?
//Answer is Yes

public class OverloadingMainMethod {

    public static void main(String[] args) {
        System.out.println("Inside the Main method");
        main("OverLoading Main Method is done");
    }

    public static void main(String s){
        System.out.println(" Overloading main() method :: " + s);
    }


}
