import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        return IntStream.rangeClosed(0, 9)
						.filter(idx -> {
							int[] sortedNumbers = Arrays.stream(numbers)
														.sorted()
														.toArray();
							System.out.println("idx: " + idx);
							System.out.println("sortedNumbers: " + Arrays.toString(sortedNumbers));
							System.out.println(Arrays.binarySearch(sortedNumbers, idx));
							System.out.println("==================");
							return Arrays.binarySearch(sortedNumbers, idx) < 0;
						})
						.sum();
    }
}