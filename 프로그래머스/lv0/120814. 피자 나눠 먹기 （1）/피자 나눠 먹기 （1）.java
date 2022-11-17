class Solution {
    public static int solution(int n) {
        int answer = (int)Math.floor( (n-1) / 7 ) + 1;
        // int answer = (int)Math.ceil( n / 7.0 );
        return answer;
    }
}
/*
    Math.ceil(); 를 사용하는 방법
    - ceil함수의 매개변수로는 double 타입이 들어와야 한다.
*/