import java.util.ArrayList;
class Solution {
    public int solution(String my_string) {
       my_string = my_string.replaceAll("[^0-9]", "");

            int answer = 0;

            for(int i=0; i<my_string.length(); i++) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }           

            return answer;      
        }
}