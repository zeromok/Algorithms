import java.util.stream.IntStream;

class Solution {
	public int solution(int a, int d, boolean[] included) {
		return IntStream.range(0, included.length)
						.filter(item -> included[item]) // 값이 true 인 인덱스 수집
						.map(idx -> a + (idx * d)) // 인덱스를 가지고 해당 항의 등차수열 수집
						.sum();
	}
}