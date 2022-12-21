package BinarySearch;

public class SliptArray {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[] num, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < num.length; i++) {
            start = Math.max(start,num[i]);
            end += num[i];
        }
        while(start<end){
            int mid = start +(end-start)/2;
            int sum = 0;
            int pieces = 1;
            for (int nums : num) {
                if(sum+nums>mid){
                    sum = nums;
                    pieces++;
                }else{
                    sum += nums;
                }
            }
            if(pieces>m){
                start=mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
}
