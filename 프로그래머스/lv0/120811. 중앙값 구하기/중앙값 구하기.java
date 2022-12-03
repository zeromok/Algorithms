import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[(int)Math.floor(array.length/2)];
        return answer;
    }
}