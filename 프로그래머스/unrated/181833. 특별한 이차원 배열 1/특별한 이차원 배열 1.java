class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    result[i][j] = 1;
                    continue;
                }
                result[i][j] = 0;
            }
        }
        return result;
    }
}