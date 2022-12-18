import java.util.*;
class Solution {
    public ArrayList solution(long n) {
        String result = n + "";
        char[] str = result.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = str.length-1; i>=0; i--) {
            list.add(str[i] - '0');
        }
        return list;
    }
}