import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
	public String solution(int[] numLog) {
		return IntStream.range(0, numLog.length - 1)
						.mapToObj(i -> {
							return switch (numLog[i + 1] - numLog[i]) {
								case 1 -> "w";
								case 10 -> "d";
								case -1 -> "s";
								case -10 -> "a";
								default -> "";
							};
						})
						.collect(Collectors.joining());
	}
}