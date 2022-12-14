import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}