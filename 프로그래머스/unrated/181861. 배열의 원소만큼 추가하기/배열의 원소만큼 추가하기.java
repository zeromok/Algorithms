import java.util.ArrayList;
class Solution {
    public static ArrayList solution(int[] arr) {
        ArrayList result = new ArrayList();
        for (int item : arr) {
            for(int i = 0; i<item; i++) {
                result.add(item);
            }
        }
        return result;
    }
}