import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		// BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt( br.readLine() );

		int[] A = new int[ N ];
		for ( int i = 0; i < N; i++ ) {
			A[ i ] = Integer.parseInt( br.readLine() );
		}

		Stack< Integer > stack = new Stack<>();
		int num = 1;
		boolean trigger = true;
		for ( int i = 0; i < A.length; i++ ) {
			if ( A[ i ] >= num ) {

				while ( A[ i ] >= num ) {
					stack.push( num++ );
					sb.append( "+\n" );
				}
				stack.pop();
				sb.append( "-\n" );

			} else {
				int top = stack.pop();

				if ( top > A[ i ] ) {
					trigger = false;
					break;
				} else {
					sb.append( "-\n" );
				}
			}
		} // for

		if ( trigger ) {
			System.out.println( sb );
		} else {
			System.out.println( "NO" );
		}
	}
} // end