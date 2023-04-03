class Solution {

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public int solution(int n) {
        int result = 1;
        for (int i = 1; i <= 10; i++) {
            if (factorial(i) <= n) result = i;
            else return result;
        }
        return result;
    }
}