class Solution {
    public long solution(long n) {
        if (n == 1) return 0;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
                count++;
            }else if (n % 2 == 1) {
                n = n * 3 + 1;
                count++;
            }
        }
        return count > 500 ? -1 : count;
    }
}