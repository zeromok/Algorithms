import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		int N = Integer.parseInt( br.readLine() );
		int[] A = new int[ N ];
		int[] result = new int[ N ];

		StringTokenizer st = new StringTokenizer( br.readLine() );
		for ( int i = 0; i < N; i++ ) {
			A[ i ] = Integer.parseInt( st.nextToken() );
		}

		Stack< Integer > stack = new Stack<>();
		stack.push( 0 );

		for ( int i = 1; i < N; i++ ) {
			while ( ! stack.isEmpty() && A[stack.peek()] < A[ i ] ) {
				result[ stack.pop() ] = A[ i ];
			}
			stack.push( i );
		}

		while ( ! stack.isEmpty() ) {
			result[ stack.pop() ] = - 1;
		}

		for ( int i = 0; i < result.length; i++ ) {
			bw.write( result[ i ] + " " );
		}

		bw.flush();
		bw.close();
	}

} // end