import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

		StringTokenizer st = new StringTokenizer( br.readLine() );
		long N = Long.parseLong( st.nextToken() );
		long M = Long.parseLong( st.nextToken() );

		A = new ArrayList[( int )( N + 1) ];
		visited = new boolean[( int )(N+1)];

		for ( int i = 1; i < N+1; i++ ) {
			A[i] = new ArrayList<>();
		}

		for ( int j = 0; j < M; j++ ) {
			st = new StringTokenizer( br.readLine() );

			long s = Long.parseLong( st.nextToken() );
			long e = Long.parseLong( st.nextToken() );

			A[( int )s].add( ( int )e );
			A[( int )e].add( ( int )s );
		}

		long count = 0;
		for ( int i = 1; i < N + 1; i++ ) {
			if ( ! visited[i] ) {
				count++;
				DFS( i );
			}
		}

		System.out.println( count );

		bw.flush();
		bw.close();
	}

	private static void DFS( int i) {
		if ( visited[i] ) {
			return;
		}
		visited[i] = true;
		for ( int item : A[i] ) {
			if ( ! visited[item] ) {
				DFS( item );
			}
		}
	}

} // end