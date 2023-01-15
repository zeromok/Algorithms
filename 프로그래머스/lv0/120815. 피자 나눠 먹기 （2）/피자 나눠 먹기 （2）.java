class Solution {
    public int solution(int n) {
        int piece = 6;
        int r;
        int result = n*6;
        while( piece != 0) {
            r = n % piece;
            n = piece;
            piece = r;
        }
        return (result/n)/6;
    }
}
/*
    접근법 :
    Js 와 같은 접근법으로 접근했고, 주의할 타입도 별로 없어 무난했던것 같다.
    처음에는 이중포문으로 접근했다가 시간초과에 걸렸다..ㅠ


    다른 접근법 : 유클리드 호제법 보다 좀 더 접근성 있는? 방법 같다.
    class Solution {
        public int solution(int n) {

            int answer = 0;

            // 두 수 의 곱 까지 연산 -> 왜? 두수의 곱은 어차피 딱 나누어 떨어짐(최대공배수)
            for (int i = 1; i <= 6 * n; i++) {

                // 피자가 n명에게 같은 조각으로 떨어질때
                if (6 * i % n == 0) {
                    answer = i;
                    break;
                }
            }
            return answer;

        } // main()
    } // end class

*/