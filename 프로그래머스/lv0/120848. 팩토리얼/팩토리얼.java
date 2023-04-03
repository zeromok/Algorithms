class Solution {
    public int solution(int n) {
       int result = 1;
        for (int i = 1; i <= 10; i++) {
            result *= i;
            if (result == n) return i;
            if (result > n) return i-1;
        }
        return result;
    }
}