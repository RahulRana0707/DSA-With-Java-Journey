package BinarySearch;

import java.util.Arrays;

//https://leetcode.com/problems/sqrtx/
public class SquareRoot {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(findIndex(x));
    };
    static int findIndex(int x){
        int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }

}
