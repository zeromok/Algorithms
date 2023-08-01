class Solution {
	public String solution( String my_string, int s, int e ) {
		String reverse = new StringBuilder( my_string.substring( s, e + 1 ) )
			.reverse( )
			.toString( );

		return IntStream.range( 0, my_string.length( ) )
						.mapToObj(
							idx -> idx >= s && idx <= e ? reverse.charAt( idx - s )
														: my_string.charAt( idx ) )
						.map( Object::toString )
						.collect( Collectors.joining( ) );
	}
}