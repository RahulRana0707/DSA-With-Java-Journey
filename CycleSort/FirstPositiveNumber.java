package CycleSort;

public class FirstPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {-1,-2,1,2,3,4,5};
        System.out.println(findNumber(arr));
    }

    // Method to find the smallest positive missing number in the array
    static int findNumber(int[] arr){
        int i = 0;
        // Loop through the array
        while(i < arr.length){
            // Calculate the correct index for the current element
            int correctIndex = arr[i] - 1;
            // If the current element is positive, within the bounds of the array, and not already at the correct index, swap it with the element at the correct index
            if(arr[i]> 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        // Loop through the array again to find the first element that is not at the correct index
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j+1;
            }
        }
        // If no such element is found, return arr.length + 1 because all the element in array is positive and sorted.
        return arr.length+1;
    }
}
