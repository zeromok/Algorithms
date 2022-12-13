class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(true == Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            }else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
/*
    접근법 :
    대소문자로 바뀐 문자들이 들어올 문자열 선언 -> answer
    들어온 문자열을 순회하며 문자들을 뽑아온다 -> .charAt();
    뽑아온 문자가 대문자인지, 소문자인지 판별 -> isUpper(Lower)Case();
    조건 대로 빈 문자열에 넣어준 다음 반환해준다.

    
*/