class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            answer += my_string.charAt(i);
            for(int j=1; j<n; j++) {
                 answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
/*
    나의 풀이법 :
    1. my_string(문자열)의 각 문자를 n번 반복한 문자열을 반환해줘야한다.
    2. 빈 문자열을 만든다
        -> 들어온 문자열을 순회하며 각 문자를 n번 반복해 넣는다
        -> 배열을 반환
    3. JS 와 비숫하게 접근 (JS 와 JAVA 의 차이점 주의)
*/