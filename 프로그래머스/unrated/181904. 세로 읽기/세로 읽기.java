class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder( );
		for ( int i = 0; i < ( int )Math.ceil( ( double )my_string.length( ) / m ); i++ ) {
			sb.append( my_string.substring( i * m, i * m + m )
								.charAt( c - 1 ) );
		}
		return sb.toString( );
    }
}