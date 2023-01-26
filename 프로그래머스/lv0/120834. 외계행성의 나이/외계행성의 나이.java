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