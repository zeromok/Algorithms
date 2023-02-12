class Solution {
    public int solution(int num, int k) {
        
        String str = Integer.toString(num);
        
        if(str.indexOf("" + k) == -1) return -1;
        
        return str.indexOf("" + k) + 1;
        
        
    }
} // end