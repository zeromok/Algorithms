import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9)
            .filter(idx -> Arrays.stream(numbers).noneMatch(number -> number == idx))
            .sum();
    }
}