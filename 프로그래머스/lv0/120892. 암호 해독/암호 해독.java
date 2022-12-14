class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
/*
    접근법 :
    조건에 맞는 문자를 받기위한 문자열 선언 -> answer
    for문의 조건으로 code의 배수 번째만 순회하게끔 조건식을 써준다.
    for문을 돌며 인덱스를 이용해 문자를 뽑아 저장 후 반환

    다른 접근법 : 
*/