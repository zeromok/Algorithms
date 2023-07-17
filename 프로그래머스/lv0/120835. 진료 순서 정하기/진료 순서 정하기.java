import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        List< Integer > list = Arrays.stream( emergency )
									 .boxed()
									 .collect( Collectors.toList() );
		List< Integer > sorted = list.stream()
									 .sorted( Comparator.reverseOrder())
									 .collect( Collectors.toList());
		return list.stream()
				   .mapToInt( num -> sorted.indexOf( num ) + 1 )
				   .toArray();
    }
}