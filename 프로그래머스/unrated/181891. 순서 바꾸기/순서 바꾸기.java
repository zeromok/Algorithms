import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length];
        IntStream.range(n, num_list.length).forEach(i -> result[i - n] = num_list[i]);
        IntStream.range(0, n).forEach(i -> result[i + num_list.length - n] = num_list[i]);
        return result;
    }
}