import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String my_string) {
        List< Integer > numbers = new ArrayList<>();
		int temp = 0;
		for ( int i = 0; i < my_string.length(); i++ ) {
			char ch = my_string.charAt( i );
			if ( Character.isDigit( ch ) ) {
				temp = temp * 10 + Character.getNumericValue( ch );
			} else {
				numbers.add( temp );
				temp = 0;
			}
		}
        numbers.add( temp );
		return numbers.stream().reduce( 0, Integer :: sum );
    }
}