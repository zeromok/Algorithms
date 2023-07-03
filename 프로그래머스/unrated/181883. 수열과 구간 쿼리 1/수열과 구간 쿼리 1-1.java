class Solution {
	public int[] solution( int[] arr, int[][] queries ) {
		Arrays.stream( queries )
			  .flatMapToInt( query -> IntStream.rangeClosed( query[ 0 ], query[ 1 ] ) )
			  .forEach( i -> arr[ i ] += 1 );
		return arr;
	}
}