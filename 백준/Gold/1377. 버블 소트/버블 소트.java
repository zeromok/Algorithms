import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int N = Integer.parseInt( br.readLine() );
		customArr[] A = new customArr[N];

		for ( int i = 0; i < N; i++ ) {
			A[i] = new customArr( i, Integer.parseInt( br.readLine() ) );
		}

		Arrays.sort( A );

		int max = 0;
		for ( int i = 0; i < N; i++ ) {
			if ( max < A[i].index - i ) { // A[i].index(정렬 전 인덱스) - i(정렬 후 인덱스)
				max = A[i].index - i;
			}
		}

		bw.write( (max + 1) + "" );

		bw.flush();
		bw.close();
	}
} // end

class customArr implements Comparable<customArr>{
	int index;
	int value;

	public customArr (int index, int value) {
		this.index = index;
		this.value = value;
	}

	@Override
	public int compareTo( customArr o ) {
		return this.value - o.value;
	}
}