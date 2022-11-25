package basics.forloops;

public class BreakLoop2 {
    public static void main(String[] args) {

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5; i++){
                if(i == 2 && j == 2){

                    break;
                }
                System.out.println(i +"  || " + j);
            }
        }
    }
}
