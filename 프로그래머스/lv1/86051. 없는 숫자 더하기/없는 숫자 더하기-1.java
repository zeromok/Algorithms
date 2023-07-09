import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
	public int solution(int[] numbers) {
		return IntStream.rangeClosed(0, 9)
						// noneMatch() : 주어진 모든 요소들이 조건을 만족하지 않으면 반환
						.filter(idx -> Arrays.stream(numbers).noneMatch(number -> number == idx))
						.sum();
	}
}