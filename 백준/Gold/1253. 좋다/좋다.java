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
		int[] A = new int[ N ];

		StringTokenizer st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < N; i++ ) {
			A[ i ] = Integer.parseInt( st.nextToken() );
		}

		Arrays.sort( A );

		int result = 0;
		for ( int i = 0; i < N; i++ ) {
			int find = A[i];
			int start = 0;
			int end = N - 1;

			while ( start < end ) {
				if(A[start] + A[end] == find) {
					if(start != i && end != i) {
						result++;
						break;
					}else if(start == i) {
						start++;
					}else if(end == i){
						end--;
					}
				}else if(A[start] + A[end] < find) {
					start++;
				}else  {
					end--;
				}
			}
		}

		bw.write( String.valueOf( result ) );

		bw.flush();
		bw.close();
	}

} // end