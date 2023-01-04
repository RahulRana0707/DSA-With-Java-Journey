package BinarySearch;

import java.util.Arrays;

public class TwoSum167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] arr,int x){
        int[] ansArr = {-1,-1};
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if (arr[start]+arr[end]==x){
                ansArr[0] = start+1;
                ansArr[1] = end+1;
                return ansArr;
            } else if (arr[start]+arr[end] > x) {
                end = end-1;
            }else {
                start = start +1;
            }
        }
        return ansArr;
    }
}
