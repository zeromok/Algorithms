import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
     
        String[] arr = my_string.split("");
        
        Collections.swap(Arrays.asList(arr), num1, num2);
    
        String result = "";
        for(String item : arr) {
            result += item;
        }
        
        return result;
    }
}