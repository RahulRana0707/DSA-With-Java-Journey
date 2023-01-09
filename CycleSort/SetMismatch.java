package CycleSort;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(Arrays.toString(findMismatch(arr)));
    }

    // Finds the two numbers that are not in the correct position in the array
    static int[] findMismatch(int[] nums) {
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Find the correct position for the current number
            int correctPos = nums[i] - 1;
            // If the current number is not in its correct position, swap it with the number at the correct position
            if (nums[i] != nums[correctPos]) {
                int temp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = temp;
            }
        }
        int[] ans = {-1,-1};
        // Find the two numbers that are not in the correct position
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]-1) {
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;
    }
}



