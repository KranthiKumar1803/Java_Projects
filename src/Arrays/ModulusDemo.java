package Arrays;

public class ModulusDemo {
        int x, y, result;
    public static void main(String[] args) {
        int[] num = {2,4,6};
        for (int i = 0; i < num.length; i++){
            if (i % 2 == 0){
                System.out.println("Here is the remainder for divisible 2 :: " + i);
            }

        }
    }
}
