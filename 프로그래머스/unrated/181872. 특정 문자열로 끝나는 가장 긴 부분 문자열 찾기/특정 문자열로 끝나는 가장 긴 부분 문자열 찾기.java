import java.util.stream.IntStream;
class Solution {
    public String solution(String myString, String pat) {
        return IntStream.range( 0, myString.length( ) )
						.mapToObj( idx -> myString.substring( 0, idx + 1 ) )
						.filter( sub -> sub.endsWith( pat ) )
						.reduce( "", ( acc, curr ) -> curr );
    }
}