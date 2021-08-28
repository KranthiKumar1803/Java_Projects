package SearchingSorting;

/**
 * Using Iterative function
 */

public class BinarySearch {
    static int binSearch(int[] a, int key){
        int low = 0;
        int high = a.length - 1;

        while (low <= high)
        {
            int mid = low + ((high - low)/2);

            if (key == a[mid]){
                return mid;
            }
            if (key < a[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] inputs = {2,1,3,4,5,6,7,8};

        for (int i = 0; i < inputs.length; i++){
            System.out.println("Result ::" + binSearch(arr,inputs[i]));

        }
    }
}
