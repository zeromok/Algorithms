import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[sides.length - 1] >= sides[0] + sides[1] ? 2 : 1;
    }
}