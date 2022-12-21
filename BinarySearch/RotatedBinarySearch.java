package BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 1;
        int pivot = findPivot(arr);
        System.out.println(ans(arr,target,pivot));
    }
    static int ans(int[] arr,int target,int pivot){
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(target == arr[pivot]) {
            return pivot;
        }else if(arr[0] <=  target){
            return binarySearch(arr,target,0,pivot-1);
        }else{
            return binarySearch(arr,target,pivot+1, arr.length-1);
        }
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
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

