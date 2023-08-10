import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
		return Arrays.stream( s.split( "" ) )
					 .filter( ch -> s.indexOf( ch ) == s.lastIndexOf( ch ) )
					 .sorted()
					 .collect( Collectors.joining() );
    }
}