class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];

		// num_list 의 요소들을 앞에서 부터 n개씩 묶어 result 에 대입
		for (int i = 0; i < num_list.length / n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = num_list[i * n + j];
			}
		}
		return result;
    }
}