package SnippetCodes.practice;

public class FindingRealNum {


    public static void main(String[] args) {
        int n1 = 45;
        int n2 = 40;
        int n3 = 20;

        if ( n1 >= n2 && n1 >= n3){
            System.out.println("n1 is the largest of all v : " + n1);
        }
        else if (n2 >= n3 && n2 >= n1) {
            System.out.println("n2 is the largest of all k : " + n2);
        }
        else{
            System.out.println("n3 is the largest of all vic : " + n3);
        }
    }

}
