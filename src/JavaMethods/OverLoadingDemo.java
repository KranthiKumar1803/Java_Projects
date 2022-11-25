package JavaMethods;

public class OverLoadingDemo {
    public void addclass(int a, int b){
//        a = 10;
//        b = 20;

        System.out.println("Here is base class : " + (a + b));
    }

    public void addclass(int a, int b, int c){
//        a = 10;
//        b = 20;
//        c = 30;

        System.out.println("Here is base class with overloading c ---> : " + (a + b + c));
    }

    public static void main(String[] args) {
        OverLoadingDemo obj = new OverLoadingDemo();
        obj.addclass(10,20);
        obj.addclass(10,20, 30);
    }


}
