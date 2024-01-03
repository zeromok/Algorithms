import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		long N = Long.parseLong( br.readLine() );
		long[] A = new long[10001];
		for ( int i = 0; i < N; i++ ) {
			A[( int )Long.parseLong( br.readLine() )]++;
		}

		for ( int i = 0; i <= 10000; i++ ) {
			if ( A[i] != 0 ) {
				for ( int j = 0; j < A[i]; j++ ) {
					bw.write( i + "\n" );
				}
			}
		}

		bw.flush();
		bw.close();
	}
} // end