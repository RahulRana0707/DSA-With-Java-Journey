package MatrixBinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 37;
        System.out.println(Arrays.toString(findTarget(matrix,target)));
    }
    static int[] findTarget(int[][] matrix,int target){
        int r = 0;
        int c = matrix.length-1;
        while(r<matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
//            if target is greater than matrix[r][c] then we are increase the value
//                    of row by one
            if(target>matrix[r][c]){
                r += 1;
//                if target is less than matrix[r][c] then we are decreasing the value
//                  of col by one
            } else{
                c -= 1;
            }
        }
        return new int[]{-1,-1};
    }
}
