import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        // 모스부호가 담긴 배열
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" "); // 매개변수로 들어온 모스부호 문자열을 나누어 배열로 변환

        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                // 매핑되는 부호를 찾고 아스키 코드를 이용해 문자로 변환
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}
/*
* 아스키코드, StringBuilder 를 사용한 풀이법
*
* */