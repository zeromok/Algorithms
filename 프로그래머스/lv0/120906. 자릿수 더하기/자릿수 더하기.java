import java.util.Arrays;
class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        int result = 0;
        for(int i=0; i<arr.length; i++) {
           arr[i] = str.charAt(i) - '0';
            result += (int)arr[i];
        }
        return result;
    }
}