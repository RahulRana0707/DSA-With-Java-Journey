package SelectionSort;
import java.util.Arrays;

public class SelectionSort_Ex {
    public static void main(String[] args) {
        int[] arr = {2,-32,0,78,-10,-16,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for (int i = 0; i <= last; i++) {
            if (arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
