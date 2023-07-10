import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
	public int solution(int[] numbers) {
		return 45 - Arrays.stream( numbers ).reduce( 0, Integer :: sum );
	}
}