import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int N = Integer.parseInt( br.readLine() );
		int M = Integer.parseInt( br.readLine() );
		int[] A = new int[ N ];
		int count = 0;

		StringTokenizer st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < N; i++ ) {
			A[ i ] = Integer.parseInt( st.nextToken() );
		}

		Arrays.sort( A );

		int i = 0;
		int j = N - 1;
		while ( i < j ) {
			if ( A[ i ] + A[ j ] < M ) {
				i++;
			} else if ( A[ i ] + A[ j ] > M ) {
				j--;
			} else {
				i++;
				j--;
				count++;
			}
		}

		bw.write( String.valueOf( count ) );

		bw.flush();
		bw.close();
	}

} // end