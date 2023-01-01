package BubbleSortAlgorithm;

import java.util.Arrays;

public class BSA_EX {
    public static void main(String[] args) {
        int[] arr = {9,7,6,8,5,3,1,2,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
//        run the step length-1 times for outer loop
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
//            for every loop of i in j the max element will come at last index
//            therefore we do not have to check last index
            for (int j = 1; j < arr.length-i; j++) {
//                swap if item is smaller than pre item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            if any value of outer loop is not sorting it means array is sorted then break;
            if(!swapped){
                break;
            }
        }
    }
}
