import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

	// 상하좌우 탐색을 위한 변수 x, y
	static int[] x = { 0, 1, 0, -1 };
	static int[] y = { 1, 0, -1, 0 };

	static int[][] A;
	static boolean[][] visited;
	static int N, M;

	public static void main( String[] args ) throws IOException {

		StringTokenizer st = new StringTokenizer( br.readLine( ) );
		N = Integer.parseInt( st.nextToken( ) );
		M = Integer.parseInt( st.nextToken( ) );

		A = new int[ N ][ M ];
		visited = new boolean[ N ][ M ];

		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			String temp = st.nextToken( );
			for ( int j = 0; j < M; j++ ) {
				A[ i ][ j ] = Integer.parseInt( temp.substring( j, j + 1 ) );
			}
		}

		BFS( 0, 0 );

		System.out.println( A[ N - 1 ][ M - 1 ] );

		bw.flush( );
		bw.close( );
	}

	private static void BFS( int i, int j ) {
		Queue< int[] > queue = new LinkedList<>();

		queue.add( new int[] { i, j } );
		visited[i][j] = true;

		while ( ! queue.isEmpty() ) {
			int[] data = queue.poll();
			for ( int k = 0; k < 4; k++ ) {
				int newX = data[0] + x[k];
				int newY = data[1] + y[k];
				if ( newX >= 0 && newY >= 0 && newX < N && newY < M ) {
					if ( A[newX][newY] != 0 && ! visited[newX][newY] ) {
						visited[newX][newY] = true;
						A[newX][newY] = A[data[0]][data[1]] + 1;
						queue.add( new int[] { newX, newY } );
					}
				}
			}
		}
	}
} // end
