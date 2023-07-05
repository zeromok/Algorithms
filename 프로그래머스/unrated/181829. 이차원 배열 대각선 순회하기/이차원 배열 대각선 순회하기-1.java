class Solution {
	public int solution( int[][] board, int k ) {
		return IntStream.range( 0, board.length )
						.flatMap( i -> IntStream.range( 0, board[ i ].length )
												.filter( j -> i + j <= k )
												.map( e -> board[ i ][ e ] )
						)
						.sum();
	}
}