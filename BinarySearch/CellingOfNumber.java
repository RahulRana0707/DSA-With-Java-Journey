package BinarySearch;

public class CellingOfNumber {
    public static void main(String[] args) {
        int[] arr= {1,3,4,7,22};
        int target = 7;
        System.out.println(findNumber(arr,target));
    }
    static int findNumber(int[] arr,int target){
        if (target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
//            take the middle index of an array
//            not taking start+end/2 because sometimes
//            it make exceeds the int value
//            if the length of array will be big
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
