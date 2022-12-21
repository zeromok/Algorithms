class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        
        String upper = s.toUpperCase();
        
        for(int i=0; i<upper.length(); i++) {
            if(upper.charAt(i) == 'P') {
                p++;
            }else if(upper.charAt(i) == 'Y') {
                y++;
            }
        }
        
        return p == y ? true : false;
        
    }
}