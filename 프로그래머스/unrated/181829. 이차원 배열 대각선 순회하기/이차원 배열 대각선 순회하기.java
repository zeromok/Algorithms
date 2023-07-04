class Solution {
    public int solution(int[][] board, int k) {
        // board[ i ][ j ] 의 합
		// i + j <= k
		int result = 0;
		for ( int i = 0; i < board.length; i++ ) {
			for ( int j = 0; j < board[ i ].length; j++ ) {
				if ( i + j <= k ) {
					 result += board[ i ][ j ];
				}
			}
		}
		return result;
    }
}