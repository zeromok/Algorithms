import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    for (int[] query : queries) {
        int temp = list.get(query[0]);
        list.set(query[0], list.get(query[1]));
        list.set(query[1], temp);
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}