package src.main.search;

import java.util.ArrayList;

/**
 * packageName :  src.main.search
 * fileName : Node
 * author : Daniel
 * date : 2024-01-30 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2024-01-30           Daniel               최초 생성
 */
class Node {
	
	// 노드의 값
	int value;
	
	// 방문했는지?
	boolean visited;
	
	// 노드의 인접 노드
	ArrayList<Node> adjacentNode;
	
	public Node(int i, boolean b, ArrayList<Node> nodes) {
		this.value = i;
		this.visited = b;
		this.adjacentNode = nodes;
	}
	
	public String toString() {
		return value + " " + visited + " " + adjacentNode;
	}
}
