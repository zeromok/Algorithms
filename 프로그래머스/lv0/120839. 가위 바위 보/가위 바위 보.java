class Solution {
    public String solution(String rsp) {
        String result = "";
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '5') {
                result += '2';
            }else if(rsp.charAt(i) == '2') {
                result += '0';
            }else {
                result += '5';
            }
        }
        return result;
    }
}
/*
    접근법 :
    매핑되는 문자를 받을 새로운 문자열 선언
    들어온 문자열을 순회하며 각각의 문자를 호출해 if문으로 비교후 새로운 문자열에 넣어줌


    다른 접근법 : JS처럼 replace 사용하기에는 제약이 있다.

    1. 삼항 연산자 사용
        자바는 여기가 최대한 인 것 같다...
    class Solution {
        public String solution(String rsp) {
            String result = "";
            for(int i=0; i<rsp.length(); i++) {
                result += rsp.charAt(i) == '5' ? "2" : rsp.charAt(i) == '2' ? "0" : "5";
            }
            return result;
        }
    }
*/