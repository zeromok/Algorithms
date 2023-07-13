import java.util.ArrayList;

class Solution {
	public String solution( String myString, String pat ) {
		ArrayList< String > result = new ArrayList<>( );
		for ( int i = 0; i < myString.length( ); i++ ) {
			result.add( myString.substring( 0, i + 1 ) );
		}
		return result.get( result.size( ) - 1 );
	}
}