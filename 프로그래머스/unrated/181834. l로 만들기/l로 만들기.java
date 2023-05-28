import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split("")).map(item -> {
            if (item.charAt(0) < 108) return "l";
            return item;
        }).collect(Collectors.joining());
    }
}