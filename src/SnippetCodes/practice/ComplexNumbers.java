package SnippetCodes.practice;



public class ComplexNumbers {

    double real;
    double img;


    public ComplexNumbers(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static ComplexNumbers sum(ComplexNumbers c1 , ComplexNumbers c2 ) {

        ComplexNumbers complexHall = new ComplexNumbers(0,0);
        complexHall.real = (c1.real + c2.real);
        complexHall.img = (c1.img + c2.img);
       // System.out.println("complexHall just got filled with one set of c member mates : " + complexHall);

        return  complexHall;
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(5.5, 4 );
        ComplexNumbers c2 = new ComplexNumbers(1.2 , 3.5 );

        System.out.println("Here is the cagents collect the complex numbers for Boss : " + "real " +c1.img +  "img"+ c2.real);

        ComplexNumbers tab = sum(c1, c2);

        System.out.println("Here is the piece of cake Boss : " + "real " + tab.real +   "img"+ tab.img);
    }
}
