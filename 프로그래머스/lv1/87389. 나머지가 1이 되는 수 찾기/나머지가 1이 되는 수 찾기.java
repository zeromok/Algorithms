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
