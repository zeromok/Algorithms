import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        int multiply = Arrays.stream(num_list)
            .reduce((acc, curr) -> acc * curr)
            .getAsInt();
        int sumSquare = (int) Math.pow(Arrays.stream(num_list)
                                       .reduce((acc, curr) -> acc + curr)
                                       .getAsInt(), 2);
        return multiply > sumSquare ? 0 : 1;
    }
}