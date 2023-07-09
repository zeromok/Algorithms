import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9) // 0 <= x <=9 까지의 IntStream 생성
						.filter(idx -> {
							// numbers 를 정렬시켜 생성된 IntStream 요소와 비교 후 없으면 반환시킬 예정
							int[] sortedNumbers = Arrays.stream(numbers)
														.sorted()
														.toArray();
							// Arrays.binarySearch()를 사용해 정렬된 numbers에 IntStream 요소가 없으면
							// 즉, 음수반환이 참이면 현재의 IntStream 반환
							return Arrays.binarySearch(sortedNumbers, idx) < 0;
						})
						.sum(); // 반환된 IntStream 모두 더함
    }
}