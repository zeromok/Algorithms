import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] delete_lite) {
        return Arrays.stream(arr)
                .filter(num -> Arrays.stream(delete_lite).noneMatch(i -> i == num))
                .toArray();
    }
}