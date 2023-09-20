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
		StringTokenizer st = new StringTokenizer( br.readLine() );

		long Numbers = Long.parseLong( st.nextToken() );
		long queryCnt = Long.parseLong( st.nextToken() );
		long[] sumArr = new long[ ( int )Numbers + 1];

		st = new StringTokenizer( br.readLine() );
		for ( int i = 1; i <= Numbers; i++ ) {
			sumArr[ i ] =  sumArr[ i - 1 ] + Long.parseLong(st.nextToken() );
		}

		for ( int j = 0; j < queryCnt; j++ ) {
			st = new StringTokenizer( br.readLine() );
			long  a = Long.parseLong( st.nextToken() );
			long z = Long.parseLong( st.nextToken() );
			bw.write( ( int )(sumArr[ ( int )z ] - sumArr[ ( int )(a - 1) ]) +  "\n");
		}

		bw.flush();
		bw.close();
	}
} // end