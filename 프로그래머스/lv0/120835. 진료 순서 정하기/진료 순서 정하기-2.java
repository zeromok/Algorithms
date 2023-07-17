import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(int[] emergency) {
		Map< Integer, Integer > idxMap = new HashMap<>();
		int[] result = new int[ emergency.length ];
		for ( int i = 0; i < emergency.length; i++ ) {
			idxMap.put( emergency[ i ], i );
		}
		Arrays.sort( emergency );
		int temp = 1;
		for ( int i = emergency.length - 1; i >= 0; i-- ) {
			result[ idxMap.get( emergency[ i ] ) ] = temp++;
		}
		return result;
    }
}