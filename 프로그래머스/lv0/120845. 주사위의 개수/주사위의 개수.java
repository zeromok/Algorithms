class Solution {
    public int solution(int[] box, int n) {
        int result = 1;
        for(int i=0; i<box.length; i++) {
            result = result * (int)Math.floor(box[i]/n);
        }
        return result;
    }
}
/*
    접근법 :
    for문을 돌며 원소들을 n으로 나누어 누적 곱으로 반환했다.


    다른 접근 : 향상된 포문을 이용할 수 있을까?

    1. 이용할 수 있다.
    Class Solution {
        public int solution(int[] box, int n) {
            int result = 1;
            for(int e : box) {
                result = result * (int)Math.floor(e/n);
            }
            return result;
        }
    }
*/