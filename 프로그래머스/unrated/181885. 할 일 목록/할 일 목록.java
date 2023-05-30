import java.util.Arrays;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return Arrays.stream(todo_list)
                .filter(item -> !finished[Arrays.asList(todo_list).indexOf(item)])
                .toArray(String[]::new);
    }
}