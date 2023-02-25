class Solution {
    public long solution(int a, int b) {
        
        long result = 0;
        
        if((a-b) > 0) {
            for(int i=0; i<=(a-b); i++) {
                result += b + i;
            }
            return result;
        }else if((a-b) < 0) {
            for(int i=0; i<=(b-a); i++) {
                result += a + i;
            }
            return result;
        }else {
            return a;
        }
        
    }
}