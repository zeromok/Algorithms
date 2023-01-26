class Solution {
    public String solution(int age) {
        // 아스키코드 접근
        // 0~9 : 48~57  + 49 = a~z
        // a~z : 97~122
        
        String answer = "";
        
        String str = String.valueOf(age);
        
        for(int i=0; i<str.length(); i++) {
            answer += (char)((int)str.charAt(i) + 49);
        }
        
        return answer;
    }
}
/*
    접근법 :
    JS와 마찬가지로 아스키 코드로 접근해 풀어보았다.

    String.valueOf(a) : a -> 문자열
    (int)String.charAt(i) : i번째 문자 -> 아스키코드
    (char)Number : Number -> 문자 = 아스키코드 -> 문자

    자바는 형변환으로 되는구나... 뭔가 좀 더 괜찮은? 방법이 있을것 같고...
*/