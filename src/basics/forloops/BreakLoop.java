package basics.forloops;

public class BreakLoop {
    public static void main(String[] args) {
        int i =1;

        for(i = 1; i <=10; i++){
            if(i == 5){
                System.out.println("Break statement applying at@" + i);
                System.out.println(String.format("Break statement applying at@" + i));
                break;

            }
            System.out.println("Here is the result until break stmnt happens:" + i);
        }
    }
}
