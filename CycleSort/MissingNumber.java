package CycleSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.println(findNumber(arr));
    }

    // Method to find the smallest missing positive number in the array
    static int findNumber(int[] arr){
        int i = 0;
        // Loop through the array
        while(i < arr.length){
            // Calculate the correct index for the current element
            int correctIndex = arr[i];
            // If the current element is within the bounds of the array and not already at the correct index, swap it with the element at the correct index
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }
        // Loop through the array again to find the first element that is not at the correct index
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        // If no such element is found, return the length of the array
        return arr.length;
    }
}
