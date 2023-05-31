import java.util.stream.IntStream;
class Solution {
    public static String[] solution(String[] names) {
    return IntStream.range(0, names.length)
            .filter(i -> (i + 5) % 5 == 0)
            .mapToObj(i -> names[i])
            .toArray(String[]::new);
    }
}