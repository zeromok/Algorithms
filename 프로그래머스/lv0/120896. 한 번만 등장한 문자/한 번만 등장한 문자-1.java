import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		for ( String ch : s.split( "" ) ) {
			if ( s.indexOf( ch ) == s.lastIndexOf( ch ) )
				sb.append( ch );
		}
		return Arrays.stream( sb.toString().split( "" ) ).sorted().collect( Collectors.joining() );
    }
}