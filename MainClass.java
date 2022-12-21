import java.util.*;
public  class MainClass {
    public static void main(String[] args) {
        int[][] pattern = {
                {1,2,3},
                {3,2,1},
                {2,3,1}
        };
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : pattern) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);
            }
            lists.add(list);
        }
        boolean ans = false;
        for(List<Integer> value : lists){
            for(Integer i = 1;i< value.size()+1;i++){
                if (value.contains(i)){
                    ans = true;
                }else{
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

