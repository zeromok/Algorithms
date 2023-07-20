import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    for (int[] query : queries) {
        Collections.swap(list, query[0], query[1]);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}