package BinarySearch;

public class RotationCountOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,7,9,10,11,4,3,2,1};
        int pivot = findPivot(arr);
        if (pivot == arr.length-1){
            System.out.println(0);
        }else{
            System.out.println(pivot+1);
        }
    }
    static int findPivot(int[] arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[start]<arr[end]){
                return arr.length-1;
            }
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid-1;
            }else{
                start = mid;
            }
        }
        return -1;
    }
}
