package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args){
        int[] arr = {221,235,2534,234,2254,232,2323,4};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] array){
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
