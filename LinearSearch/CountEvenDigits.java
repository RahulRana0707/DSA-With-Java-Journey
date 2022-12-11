//Find numbers with even numbers of digits Leetcode Q.no 1295
package LinearSearch;
public class CountEvenDigits {
    public static void main(String[] args) {
        int[] num = {23,345,0,-56,-76,0,43,326};
        System.out.println(searchEvenDigits(num));
    }
    static int searchEvenDigits(int[] arr){
        int evenCount = 0;
        for (int value : arr){
            int count = digits(value);
            if(count %2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
    static int digits(int value){
        int count = 0;
        if (value==0){
            count++;
        }
        if (value<0){
            value*=-1;
        }
        while(value>0){
            count++;
            value /= 10;
        }
        return count;
    }
}
