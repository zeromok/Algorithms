class Solution {
    public int solution(int[] box, int n) {
        int result = 1;
        for(int i=0; i<box.length; i++) {
            result = result * (int)Math.floor(box[i]/n);
        }
        return result;
    }
}