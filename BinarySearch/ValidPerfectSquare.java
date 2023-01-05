package BinarySearch;
//https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(findPerfectSquare(num));
    }
    static boolean findPerfectSquare(int num) {
        int start = 1;
        int end = num;
        if (num == 0 || num == 1){
            return true;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if((num/mid == mid) && (num%mid ==0)){
                return true;
            } else if (num/mid >mid) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
