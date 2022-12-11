//search the character from the string using linear search
package LinearSearch;
public class SearchInString {
    public static void main(String[] args){
        String str = "Rahul";
        char target = 'u';
        System.out.println(targetIndex(str,target));
    }
    static int targetIndex(String s, char c){
        if(s.length() == 0){
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }
}
