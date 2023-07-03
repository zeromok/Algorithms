import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
	public int[] solution( int[] arr, int[][] queries ) {
		Arrays.stream( queries )
			  .flatMapToInt(
				  query -> IntStream.rangeClosed( query[ 0 ], query[ 1 ] ) ) // query[0] <= i <=query[1] 에 부합하는 Int 반환
			  .forEach( i -> arr[ i ] += 1 );
		return arr;
	}
}