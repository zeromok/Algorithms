import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {

        String[] strArr = my_string
                .toLowerCase()
                .split("");

        return Arrays.stream(strArr)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
        /*
         * map(String::valueOf) : 메소드 레퍼런스 사용
         * === 같음
         * map(item -> String.valueOf(item)) : 람다 사용
         * */

    }
}