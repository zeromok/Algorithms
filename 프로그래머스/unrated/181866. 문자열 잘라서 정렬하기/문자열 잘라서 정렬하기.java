import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
class Solution {
    public String[] solution(String myString) {
        return Stream.of(myString.split("x"))
					 .filter(item -> !item.isEmpty())
					 .sorted(Comparator.naturalOrder())
					 .toArray(String[]::new);
    }
}