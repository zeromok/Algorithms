class Solution {
	public String solution( String my_string, int s, int e ) {
		String params = my_string.substring( s, e + 1 );
		StringBuilder reverse = new StringBuilder( params ).reverse( );
		return my_string.replace( params, reverse.toString( ) );
	}
}