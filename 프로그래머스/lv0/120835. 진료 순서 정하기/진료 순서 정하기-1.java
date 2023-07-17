import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
		int[] result = new int[ emergency.length ];
		List< Integer > list = Arrays.stream( emergency )
									 .boxed()
									 .sorted( Comparator.reverseOrder() )
									 .collect( Collectors.toList() );
		for ( int i = 0; i < emergency.length; i++ ) {
			result[ i ] = list.indexOf( emergency[ i ] ) + 1;
		}
		return result;
    }
}