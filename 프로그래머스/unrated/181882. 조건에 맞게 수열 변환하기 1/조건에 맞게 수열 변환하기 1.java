import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        return Arrays.stream(arr).map((item) -> {
            if (item >= 50 && item % 2 == 0) return item / 2;
            if (item < 50 && item % 2 == 1) return item * 2;
            return item;
        }).toArray();
    }
}