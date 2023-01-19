package SnippetCodes.staicmethods;

public class InstanceMethods {

    String name = "";
    int age;
    String designation = "";

    /*
    Here is the instance method which always beelongs to
    Object of the class. Can be called within the class, outside the class and from
    other packages too.
     */
    public void getDetails(String n, int age, String des){
        this.name = n;
        this.age = age;
        this.designation = des;

    }

    public static void main(String[] args) {
        InstanceMethods inst = new InstanceMethods();
        //
        //        System.out.println("Name : " + inst.name);
        //        System.out.println("Int datatype as Age : " + inst.age);
        //        System.out.println("Designation : " + inst.designation);

        //Modified the data depending on the objects coming to this class
        inst.getDetails("Anil", 27, "Developer");
        System.out.println("Instance method called : " + inst.name + " : " + inst.age + " : " + inst.designation);

    }
}
