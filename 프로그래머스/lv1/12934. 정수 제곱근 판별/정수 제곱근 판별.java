class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long result = (long)Math.pow( (sqrt + 1), 2 );
        if(sqrt == Math.floor(sqrt)) {
            return result;
        }
        return -1;
    }
}