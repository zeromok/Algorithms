class Solution {
    public int solution(int n) {
        
        for(int i=n-1; i>0; i--) {
            
            if(n%(n-i) == 1) {
                return (n-i);
            }
            
        }
        return n;
    }
}
/*
    접근법 :
    내가 접근한 방법은 너무 돌아간? 접근인것 같아
    다른 접근법을 중심으로 기록하려한다. ㅠㅠ


    다른 접근법 :
    class Solution {
        public int solution(int n) {

            // 2보다 작은수로 나누면 오류가 난다 ㅠㅠ
            for(int i=2; i<n; i++) {
                if(n%i == 1) { return i; }
            }

        }
        // 모든 상황을 커버해야함, 그냥 들어온 수 나가게 만들어줌
        return n;

    } // end class
*/
