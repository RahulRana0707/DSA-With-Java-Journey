import java.util.*;
public  class MainClass {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,9,8,7,2};
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        System.out.println(arr[arr.length-1]);
    }
}

