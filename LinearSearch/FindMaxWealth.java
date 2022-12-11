//Find the wealth value of the richest person in a 2D array LeetCode Q.no 1672
package LinearSearch;
public class FindMaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(MaxWealth(arr));
    }
    static int MaxWealth(int[][] arr){
        int richestOne = 0;
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (richestOne < sum){
                richestOne = sum;
            }
        }
        return richestOne;
    }
}
