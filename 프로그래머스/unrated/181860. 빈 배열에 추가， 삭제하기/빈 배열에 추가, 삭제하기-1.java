import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
		List< Integer > result = new ArrayList<>();
		IntStream.range( 0, arr.length ) // 0 <= IntStream <arr.length
				 .forEach( i -> {
					 if ( flag[ i ] ) {
						 IntStream.range( 0, arr[ i ] * 2 ).forEach( j -> result.add( arr[ i ] ) );
					 } else {
						 IntStream.range( 0, arr[ i ] ).forEach( j -> result.remove( result.size() - 1 ) );
					 }
				 } );
		return result.stream().mapToInt( Integer :: intValue ).toArray();
    }
}