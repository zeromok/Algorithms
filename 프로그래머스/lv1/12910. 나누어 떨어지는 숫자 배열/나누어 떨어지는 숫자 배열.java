import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr).filter(item -> item % divisor == 0).sorted().toArray();
        if(result.length == 0) return new int[]{-1};
        return result;
    }
}