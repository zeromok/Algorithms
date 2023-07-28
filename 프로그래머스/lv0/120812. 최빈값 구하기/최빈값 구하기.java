import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] array) {
        Map< Integer, Integer > map = new HashMap<>();

		for ( int key : array ) {
			map.put( key, map.getOrDefault( key, 0 ) + 1 );
		}

		int count = 0;
		int key = 0;
		for ( Map.Entry< Integer, Integer > item : map.entrySet() ) {
			if ( count < item.getValue() ) {
				count = item.getValue();
				key = item.getKey();
			} else if ( count == item.getValue() ) {
				key = -1;
			}
		}

		return key;
    }
}