class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split( "" );

		for ( int temp : indices ) {
			strArr[ temp ] = "";
		}
		
		return String.join( "", strArr );
    }
}