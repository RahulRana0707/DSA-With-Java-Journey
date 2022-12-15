package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(findLetter(letters, target));
    }
    static char findLetter(char[] arr,char t){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(t<arr[mid]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return arr[start%arr.length];
    }
}
