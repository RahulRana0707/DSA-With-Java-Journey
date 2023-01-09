package CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,6,7,9};
        System.out.println(findNumber(arr));
    }
    static List<Integer> findNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j]-1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}
