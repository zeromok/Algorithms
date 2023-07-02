import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate date1ToLocalDate = LocalDate.of( date1[ 0 ], date1[ 1 ], date1[ 2 ] );
		LocalDate date2ToLocalDate = LocalDate.of( date2[ 0 ], date2[ 1 ], date2[ 2 ] );

		return date1ToLocalDate.isBefore( date2ToLocalDate ) ? 1 : 0;
    }
}