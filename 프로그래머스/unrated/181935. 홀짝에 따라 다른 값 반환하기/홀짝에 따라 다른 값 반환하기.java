class Solution {
    public int solution(int n) {
        int temp = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) temp = i + temp;
            }
        } else if (n % 2 == 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) temp = temp + (int)Math.pow(i, 2);
            }
        }
        return temp;
    }
}