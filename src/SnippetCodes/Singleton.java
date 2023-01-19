package SnippetCodes;

public class Singleton {

    private static Singleton singletonObject = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){


         return singletonObject;
    }

    public void demoMethod(){

        String s = "Here is the singleton getInstance getting called";

       System.out.println(s);
    }

}
