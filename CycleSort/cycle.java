package CycleSort;

import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Method to sort the array using the Cycle Sort algorithm
    static void sort(int[] arr){
        int i = 0;
        // Loop through the array
        while(i < arr.length){
            // Calculate the correct index for the current element
            int correctIndex = arr[i]-1;
            // If the current element is not already at the correct index, swap it with the element at the correct index
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
    }
}
