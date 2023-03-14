import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = Arrays.stream(arr)
                .filter(item -> item % divisor == 0) // 참인 요소들로 이루어진 배열 반환
                .sorted()   // 정렬 default: 이름사전순
                .toArray(); // 위에서 반환된 Stream객체 -> 배열
        if(result.length == 0) return new int[]{-1};
        return result;
    }
}