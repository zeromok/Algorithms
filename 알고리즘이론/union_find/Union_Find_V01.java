package 알고리즘이론.union_find;

public class Union_Find_V01 {
	// find(): 재귀 없는 기본 연산
	// union(): 기본 연산

	private final int[] parent;

	public Union_Find_V01(int n) {
		this.parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	public int find(int x) {
		int root = x;

		// 집합의 대표 원소(root)를 찾는다.
		// 현재 노드의 부모를 따라 계속 올라가며 대표 원소(root)를 찾는다.
		while (root != parent[root]) {
			root = parent[root];
		}

		return root;
	}

	public void union(int a, int b) {
		int rootA = find(a);
		int rootB = find(b);
		// 두 집합의 대표 원소가 다를때만 합친다.
		// rooB 를 rootA 의 자식으로 만든다. -> 집합 B 를 A 에 편입시킨다.
		if (rootA != rootB) {
			parent[rootB] = rootA;
		}
	}
}
