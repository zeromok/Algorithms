
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        String[] arr = str.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        String result = "";
        for(int i=0; i<arr.length; i++) {
            result += arr[i];
        }
        
        return Long.parseLong(result);
    }
}