class Solution {
	public String solution( String my_string, int[] indices ) {
		return IntStream.range( 0, my_string.length() )
						.filter( strIdx ->
							// IntStream.of( indices ).noneMatch( idx -> value == idx )
							Arrays.stream( indices ).noneMatch( idx -> strIdx == idx ) )
						.mapToObj( my_string::charAt )
						.map( Object::toString )
						.collect( Collectors.joining( ));
	}
}