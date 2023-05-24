import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split("")).map(str -> {
                    if (str.equals("a") || str.equals("A")) return "A";
                    else return str.toLowerCase();
                }).collect(Collectors.joining());
    }
}