import java.util.Arrays;
class Solution {
public String solution(String my_string) {

        char[] strArr = my_string.toLowerCase().toCharArray(); // 문자열 -> 요소가 소문자인 배열
        Arrays.sort(strArr); // 배열의 정렬

        String result = String.valueOf(strArr); // 문자배열 -> 문자열

        return result;
    }
}