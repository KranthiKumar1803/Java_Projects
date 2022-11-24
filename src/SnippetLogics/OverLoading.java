package SnippetLogics;

/**
 * In Method overloading of OOPS concept method signature will not change
 * instead the parameters will changes and their data types may vary.
 * Main method can we overloaded
 * Static method can also be overloaded with same signature
 * we can also Overload methods that differ by static keyword only
 * can have diff access modifiers
 * Note : Polymorphism applies to overriding not to overloading.
 */
public class OverLoading {

    public void sound(){

        System.out.println("Cat is saying meowwww");
    }

    public void sound(int i){

        System.out.println("Cat is saying meowwww wit ----" + i);
    }

    public void sound(int i, String s){

        System.out.println("Cat is saying meowwww -- " + s + "-----" + i);
    }

    public void sound(Float i, String s){

        System.out.println("Cat is saying meowwww -- " + s + "-----" + i);
    }

    public static void show(){

        System.out.println("Showing empty Screen");

    }

    public static void show(String marvelMovie, int i){

        System.out.println("Showing marvelMovie on Screen  ::" + " [ "  + i + " ] "  + marvelMovie);

    }

    public static void playYard(){
        System.out.println("Inside the Static playYard");
    }

    //if the method name is similar to the top one and no parameter is given then it will throw compile time error
    public void playYard(int i){
        System.out.println("Inside the {overloaded ditching static} playYard :: " + i);

    }

    public static void main(String[] args) {

        OverLoading overLoading = new OverLoading();
        overLoading.sound();
        overLoading.sound(1);
        overLoading.sound(2, "tring");
        overLoading.sound(101, "tring");


        show();
        show("Black Panther", 23);

        playYard();
        overLoading.playYard(1999999);
        System.out.println("Done with Overloading ::");

    }
}
