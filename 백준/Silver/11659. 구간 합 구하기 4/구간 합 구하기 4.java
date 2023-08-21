import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = new StringTokenizer( br.readLine( ) );
		
		int numNo = Integer.parseInt( st.nextToken( ) );
		int queryNo = Integer.parseInt( st.nextToken( ) );

		st = new StringTokenizer( br.readLine( ) );
		int[] sumArr = new int[ numNo + 1 ];

		for ( int i = 0; i < numNo; i++ ) {
			sumArr[ i + 1 ] = sumArr[ i ] + Integer.parseInt( st.nextToken( ) );
		}

		for ( int i = 0; i < queryNo; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			int start = Integer.parseInt( st.nextToken( ) );
			int end = Integer.parseInt( st.nextToken( ) );

			bw.write( ( sumArr[ end ] - sumArr[ start - 1 ] ) + "\n" );
		}
		bw.flush( );
		bw.close( );
	}
}