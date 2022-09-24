package SnippetCodes.staicmethods;

/*
static methods can be called directly into the main method without any object reference
 */

public class StaticMethod {

    public static void myMethod(){
        String k = "Kranthi Chary";
        System.out.println("Here is the static method : " + k);
    }
    public static void myNextMethod(int a, int b){
        int c = a/b;
        System.out.println("Here is the static method : " + c);
    }
    public static void divideMethod(int a, int b){
        int c = a-b;
        System.out.println("Here is the static method : " + c);
    }


    public static void main(String[] args) {
        myMethod();
        //myNextMethod(4,2);
        myNextMethod(2345,10);
        divideMethod(23, 78);
    }
}
