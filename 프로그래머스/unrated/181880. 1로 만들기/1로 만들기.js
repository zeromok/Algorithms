function solution(num_list) {
    let count = 0;
		for ( let num of num_list ) {
			while ( num != 1 ) {
				count++;
				num = ( num % 2 == 0 ) ? num / 2 : ( num - 1 ) / 2;
			}
		}
		return count;
}