class Solution {
    public String solution(int num) {
       if(num%2 == 0) {
           return "Even";
       }else if(num%2 == 1 || num%2 == -1) {
           return "Odd";
       }else {
           return "num";
       }
    }
}
/*
    접근법 :
    타입을 생각할 부분이 없어서 JS랑 같은 방식으로 접근했다.


    다른 접근법 :
    삼항 연산자를 이용한 접근
    
    class Solution {
        public String solution(int num) {
            String result = (num%2 == 0) ? "Even" : "Odd";
            return result;
        }
    }
*/