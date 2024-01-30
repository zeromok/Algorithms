package main.search;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * packageName :  src.main.search
 * fileName : BFS
 * author : Daniel
 * date : 2024-01-19 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-01-19           Daniel               최초 생성
 */
public class BFS {

	public static void main( String[] args ) {

		// 노드 생성 및 그래프 초기화(값, 방문여부, 인접 노드 리스트)
		Node a = new Node( 5, false, new ArrayList<>( ) );
		Node b = new Node( 4, false, new ArrayList<>( ) );
		Node c = new Node( 3, false, new ArrayList<>( ) );
		Node d = new Node( 2, false, new ArrayList<>( ) );
		Node e = new Node( 1, false, new ArrayList<>( ) );
		Node f = new Node( 0, false, new ArrayList<>( ) );

		d.adjacentNode.add( a );
		e.adjacentNode.add( c );
		e.adjacentNode.add( b );
		f.adjacentNode.add( e );
		f.adjacentNode.add( d );

		BFS_queue( f );

	}

	private static void BFS_queue( Node root ) {

		// BFS는 큐를 사용해 구현한다.
		LinkedList< Node > queue = new LinkedList<>( );

		root.visited = true;
		queue.add( root );

		while ( queue.size( ) != 0 ) { // 큐 자료구조에 값이 없을 때까지 반복

			root = queue.poll( );
			System.out.println( root.value + " " );

			for ( Node i : root.adjacentNode ) { // 현재 노드의 인접노드를 차례로 꺼냄
				if ( !i.visited ) {
					i.visited = true;
					queue.add( i );
				}
			}

		}

	}

} // end class


