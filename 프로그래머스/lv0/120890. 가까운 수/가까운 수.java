import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        return Arrays.stream( array )
					 .reduce( array[ 0 ], ( acc, curr ) -> {
						 int accValue = Math.abs( acc - n );
						 int currValue = Math.abs( curr - n );

						 if ( accValue > currValue || accValue == currValue && acc > curr )
							 return curr;

						 return acc;
					 } );
    }
}