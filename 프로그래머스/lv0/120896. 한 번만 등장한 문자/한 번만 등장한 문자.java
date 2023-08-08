import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Objects;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder( );
		for ( int i = 0; i < s.length( ); i++ ) {
			String temp = String.valueOf( s.charAt( i ) );
			if ( Arrays.stream( s.split( "" ) )
					   .filter( v -> Objects.equals( v, temp ) )
					   .count( ) == 1 )
				sb.append( s.charAt( i ) );
		}
		return Arrays.stream( sb.toString( )
								.split( "" ) )
					 .sorted( )
					 .collect( Collectors.joining( ) );
    }
}