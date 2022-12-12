class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
/*
    접근법 :
    JS 와 같은 방식으로 풀어 보았다.
    단, 타입 주의 !
*/