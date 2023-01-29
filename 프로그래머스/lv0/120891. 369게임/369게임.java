class Solution {
    public int solution(int order) {
        
        int result = 0;
        
        String str = Integer.toString(order);
            
        for(String item : str.split("")) {
            if( Integer.parseInt(item)%3 == 0 && Integer.parseInt(item) >= 3 ) result++;
        };
            
        return result;
    }
}