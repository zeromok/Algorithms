class Solution {
    public int solution(int[] num_list) {
		int count = 0;
		for ( int num : num_list ) {
			while ( num != 1 ) {
				count++;
				num = ( num % 2 == 0 ) ? num / 2 : ( num - 1 ) / 2;
			}
		}
		return count;
    }
}