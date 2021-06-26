package JavaMethods;


// Overriding example
public class Animal {
    public void eat(){
        System.out.println("Eating..... :");

    }
    public class Dog extends Animal{
       public void eat(){
            System.out.println("eating dog food :");
        }
    }

    public static void main(String[] args) {

        Animal obj = new Animal();

        obj.eat();

     //   Animal obj1 = new Dog();



    }
}

