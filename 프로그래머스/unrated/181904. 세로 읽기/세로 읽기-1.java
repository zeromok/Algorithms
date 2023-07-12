class Solution {
	public String solution( String my_string, int m, int c ) {
		return IntStream.range( 0, ( int )Math.ceil( ( double )my_string.length( ) / m ) )
						.mapToObj( ( idx ) -> my_string.substring( idx * m, idx * m + m )
													   .charAt( c - 1 ) )
						.collect( StringBuilder::new, StringBuilder::append, StringBuilder::append )
						.toString( );
	}
}