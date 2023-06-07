import java.util.stream.IntStream;
class Solution {
    public int solution(int[] arr, int idx) {
        int[] list = IntStream.range(0, arr.length)
                .filter(num -> arr[num] == 1 && num >= idx)
                .toArray();
        return list.length == 0 ? -1 : list[0];
    }
}