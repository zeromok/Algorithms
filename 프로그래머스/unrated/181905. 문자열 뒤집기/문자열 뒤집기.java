class Solution {
    public String solution(String my_string, int s, int e) {
        String[] strArr = my_string.split( "" );
		String[] params = my_string.substring( s, e + 1 )
								   .split( "" );
		int temp = 0;
		for ( int i = 0; i < strArr.length; i++ ) {
			if ( temp > params.length - 1 )
				break;
			if ( i >= s && i <= e ) {
				strArr[ i ] = params[ params.length - 1 - temp ];
				temp++;
			}
		}
		return String.join( "", strArr );
    }
}