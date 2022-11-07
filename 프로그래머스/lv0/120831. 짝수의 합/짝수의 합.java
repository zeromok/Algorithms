class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        for(int i=0; 0<=n; i++){
            if(n%2 == 0){
                sum += n;
            }
            n--;
        }
        return sum;
    }
}