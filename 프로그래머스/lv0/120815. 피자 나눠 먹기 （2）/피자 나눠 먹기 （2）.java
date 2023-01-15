class Solution {
    public int solution(int n) {
        int piece = 6;
        int r;
        int result = n*6;
        while( piece != 0) {
            r = n % piece;
            n = piece;
            piece = r;
        }
        return (result/n)/6;
    }
}