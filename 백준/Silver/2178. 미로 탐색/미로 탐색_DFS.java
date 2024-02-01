import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

	// 상하좌우 탐색을 위한 (상하좌우)
	int[][] explore = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	// 미로를 초기화 할 2차원 배열 선언
	int[][] A;

	// 방문배열 선언
	boolean[][] visited;

	int d = 0;

	// 미로의 크기 및 도착점을 입력 받을 변수 선언
	int N, M;

	public static void main( String[] args ) throws Exception {
		new Main2( ).solution( );
	}

	private void solution( ) throws Exception {
		StringTokenizer st = new StringTokenizer( br.readLine( ) );
		N = Integer.parseInt( st.nextToken( ) );
		M = Integer.parseInt( st.nextToken( ) );

		// 입력받은 미로의 크기를 이용해 초기화
		A = new int[ N ][ M ];
		visited = new boolean[ N ][ M ];

		for ( int i = 0; i < N; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			String temp = st.nextToken( );
			for ( int j = 0; j < M; j++ ) {
				A[ i ][ j ] = temp.charAt( j ) - '0';
			}
		}

		DFS( 0, 0 );

		bw.write( A[ N - 1 ][ M - 1 ] + "" );

		bw.flush( );
		bw.close( );
	}

	private void DFS( int x, int y ) {
		if ( x < 0 || y < 0 )
			return;

		visited[ x ][ y ] = true;
		int[] now = { x, y };
		for ( int i = 0; i < 4; i++ ) {

			int newX = now[ 0 ] + explore[ i ][ 0 ];
			int newY = now[ 1 ] + explore[ i ][ 1 ];

			if ( newX < 0 || newY < 0 || newX >= N || newY >= M || visited[ newX ][ newY ] || A[ newX ][ newY ] == 0 )
				continue;
			visited[ newX ][ newY ] = true;
			A[ newX ][ newY ] = A[ now[ 0 ] ][ now[ 1 ] ] + 1;
			DFS( newX, newY );
		}
	}

} // end
