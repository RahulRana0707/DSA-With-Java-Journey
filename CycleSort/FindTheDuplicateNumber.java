package CycleSort;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
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
        int ans = -1;
        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j]-1){
                ans = arr[j];
            }
        }
        return ans;
    }
}
