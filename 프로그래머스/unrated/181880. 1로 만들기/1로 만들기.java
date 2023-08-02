class Solution {
    public int solution(int[] num_list) {
        int count = 0;
		for ( int num : num_list ) {
			while ( num != 1 ) {
				if ( num % 2 == 0 ) {
					count++;
					num = num / 2;
				} else if ( num % 2 == 1 ) {
					count++;
					num = ( num - 1 ) / 2;
				}
			}
		}
		return count;
    }
}