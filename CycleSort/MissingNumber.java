package CycleSort;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,4,2,1};
        System.out.println(findNumber(arr));
    }
    static int findNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
