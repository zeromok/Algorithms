package main.search;

import java.util.ArrayList;
import java.util.Stack;

/**
 * packageName :  src.main.search
 * fileName : DFS
 * author : Daniel
 * date : 2024-01-18 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-01-18           Daniel               최초 생성
 */
public class DFS {

	public static void main( String[] args ) {

		// 노드 생성 및 그래프 초기화(값, 방문여부, 인접 노드 리스트)
		Node a = new Node( 5, false, new ArrayList<>( ) );
		Node b = new Node( 3, false, new ArrayList<>( ) );
		Node c = new Node( 2, false, new ArrayList<>( ) );
		Node d = new Node( 4, false, new ArrayList<>( ) );
		Node e = new Node( 1, false, new ArrayList<>( ) );
		Node f = new Node( 0, false, new ArrayList<>( ) );

		d.adjacentNode.add( a );
		e.adjacentNode.add( c );
		e.adjacentNode.add( b );
		f.adjacentNode.add( e );
		f.adjacentNode.add( d );

		// 재귀(rootNode)
		DFS_recursion( f );

		// 스택(rootNode)
		// DFS_stack(f);

	}

	private static void DFS_recursion( Node node ) {
		// 인접노드가 없으면 return
		if ( node.adjacentNode == null )
			return;

		node.visited = true; // 방문 기록
		System.out.println( node );
		for ( Node n : node.adjacentNode ) {
			if ( !n.visited ) {
				DFS_recursion( n );
			}
		}
	}

	private static void DFS_stack( Node node ) {

		Stack< Node > stack = new Stack<>( );
		stack.push( node );

		while ( !stack.isEmpty( ) ) {
			Node n = stack.pop( );

			if ( !n.visited ) {
				n.visited = true;
				System.out.println( n );
				for ( Node adj : n.adjacentNode ) {
					stack.push( adj );
				}
			}

		}
	}

} // end class

