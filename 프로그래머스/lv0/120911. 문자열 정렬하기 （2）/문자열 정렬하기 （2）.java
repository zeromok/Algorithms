import java.util.Arrays;
class Solution {
    public String solution(String my_string) {

        char[] strArr = my_string.toLowerCase().toCharArray(); // 문자열 -> 요소가 소문자인 배열
        Arrays.sort(strArr); // 배열의 정렬

        return String.valueOf(strArr); // 문자배열 -> 문자열
    }
}
/*
* 접근법 :
* 매개변수 : 대소문자로 이루어진 문자열
* 반환값 : 모두 소문자인, 알파뱃 순으로 정렬된 문자열
*
* 1. 모두 소문자로 바꾼다.
* 2. 알파뱃순 으로 정렬한다.
* 3. 반환한다.
*
* .toLowcase() : 문자열을 모두 소문자로
* 문자열은 불변이라 수정불가...즉, 다른 접근방법으로 정렬시켜야함
*   1. 배열로 바꾸어 정렬
*   2. Stream 사용
* .toCharArray() : to문자배열
* Arrays.sort(배열) : 배열을 정렬시킴
* String.valueOf() : 문자열로 변환
* */