import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int solution(String myString, String pat) {
        String sorted = Arrays.stream(myString.split("")).map((item) -> {
            if (item.equals("A")) return item = "B";
            if (item.equals("B")) return item = "A";
            return item;
        }).collect(Collectors.joining(""));
        return sorted.contains(pat) ? 1 : 0;
    }
}