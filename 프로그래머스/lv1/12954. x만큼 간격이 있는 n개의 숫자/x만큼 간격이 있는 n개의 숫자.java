class Solution {
        public long[] solution(int x, int n) {

            long[] answer = new long[n];
           
           long element = x;
            for(int i=0; i<n; i++) {
                answer[i] = element;
                element += x;
            }

            return answer;
        }
    }