import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
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
		new Main( ).solution( );
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

		BFS( 0, 0 );

		bw.write( A[ N - 1 ][ M - 1 ] + "" );

		bw.flush( );
		bw.close( );
	}

	private void BFS( int x, int y ) {
		Queue< int[] > queue = new LinkedList<>( );

		int[] coordinate = { x, y };
		queue.add( coordinate );
		visited[ x ][ y ] = true;

		while ( !queue.isEmpty( ) ) { // 큐에 데이터가 없을때까지

			int[] now = queue.poll( );

			for ( int i = 0; i < 4; i++ ) { // 상하좌우 탐색 시작

				int newX = now[ 0 ] + explore[ i ][ 0 ]; // 인접한 칸(상하좌우)의 x좌표
				int newY = now[ 1 ] + explore[ i ][ 1 ]; // 인접한 칸(상하좌우)의 y좌표

				if ( newX < 0 || newY < 0 || newX >= N || newY >= M || visited[ newX ][ newY ] ||
					 A[ newX ][ newY ] == 0 ) // 제약조건 설정
					continue;

				visited[ newX ][ newY ] = true;
				A[ newX ][ newY ] = A[ now[ 0 ] ][ now[ 1 ] ] + 1; // 깊이 초기화
				queue.add( new int[] { newX, newY } );
			}
		}
	}

} // end
