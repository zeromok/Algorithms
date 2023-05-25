import java.util.stream.IntStream;
class Solution {
    public static int[] solution(int[] arr, int n) {
        int length = arr.length;
        return IntStream.range(0, length)
                .map(idx -> (length % 2 == 0 && idx % 2 != 0) || (length % 2 != 0 && idx % 2 == 0) ? arr[idx] + n : arr[idx])
                .toArray();
    }

}