import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
	static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );

	ArrayList< Node >[] nodes;
	int[] distance;
	boolean[] visited;

	public static void main( String[] args ) throws IOException {
		new Main( ).solution( );
	}

	private void solution( ) throws IOException {
		int nodeNum = Integer.parseInt( br.readLine( ) );
		distance = new int[ nodeNum + 1 ];
		nodes = new ArrayList[ nodeNum + 1 ];
		visited = new boolean[ nodeNum + 1 ];
		for ( int i = 1; i < nodeNum + 1; i++ ) {
			nodes[ i ] = new ArrayList<>( );
		}

		StringTokenizer st;
		for ( int i = 0; i < nodeNum; i++ ) {
			st = new StringTokenizer( br.readLine( ) );
			int s = Integer.parseInt( st.nextToken( ) );
			while ( true ) {
				int e = Integer.parseInt( st.nextToken( ) );
				if ( e == -1 )
					break;
				int d = Integer.parseInt( st.nextToken( ) );
				nodes[ s ].add( new Node( e, d ) );
			}
		}

		BFS( 1 );

		// 임의의 노드에서 가장 긴 경로로 연결되어 있는 노드를 찾는다.
		int max = 1;
		for ( int i = 2; i <= nodeNum; i++ ) {
			if ( distance[ max ] < distance[ i ] ) {
				max = i;
			}
		}

		// 위에서 찾은 노드로 다시 한번 수행
		distance = new int[ nodeNum + 1 ];
		visited = new boolean[ nodeNum + 1 ];
		BFS( max );

		Arrays.sort( distance );
		bw.write( distance[ nodeNum ] + "" );

		bw.flush( );
		bw.close( );

	} // solution()

	private void BFS( int i ) {
		Queue< Integer > queue = new LinkedList<>( );
		queue.add( i );
		visited[ i ] = true;
		while ( !queue.isEmpty( ) ) {
			int nowNode = queue.poll( );
			for ( Node node : nodes[ nowNode ] ) {
				int v = node.destinstion;
				int d = node.distance;
				if ( !visited[ v ] ) {
					visited[ v ] = true;
					queue.add( v );
					distance[ v ] = distance[ nowNode ] + d;
				}
			}
		}
	}
} // end

class Node {
	// 목적지 노드
	int destinstion;
	// 이어진 노드와의 거리
	int distance;

	public Node( int e, int d ) {
		this.destinstion = e;
		this.distance = d;
	}
}
