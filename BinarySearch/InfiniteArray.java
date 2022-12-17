package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,13,15,109};
        int target = 13;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newEnd = end + (end-start +1)*2;
            start = end +1;
            end = newEnd;
        }
        return binarySearch(arr,target,start,end);
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
}
