class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];

		// num_list 의 요소들을 앞에서 부터 n개씩 묶어 result 에 대입
		for (int i = 0; i < num_list.length / n; i++) {

			//  앞에서 n개씩 복사해야함
			// num_list 의 요소들 중 ( i * n ) 인덱스  부터의 요소를 result[i] 에  0 번째 인덱스 부터 n 번째 인덱스 까지 복사
			// 원본배열 영향 없음
			System.arraycopy( num_list, i * n, result[ i ], 0, n );
		}
		return result;
    }
}