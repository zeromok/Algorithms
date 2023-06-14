import java.util.Arrays;
class Solution {
    public int[] solution(String myString) {
        return myString.endsWith("x") ?
                Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray()
                : Arrays.stream(myString.split("x")).mapToInt(String::length).toArray();
    }
}