import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        ArrayList<Integer> list=new ArrayList<Integer>(); 
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                list.add(i);
            }
        }
        return list.size();
    }
}