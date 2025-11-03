package 알고리즘이론.union_find;

public class Union_Find_V03 {
	// find(): 경로 압축
	// union(): 랭크 기반 결합

	private final int[] parent;
	private final int[] rank;
	private final int N;

	public Union_Find_V03(int n) {
		this.N = n;
		this.parent = new int[n];
		this.rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0; // 초기 랭크는 0
		}
	}

	public int find(int x) {
		if (parent[x] != x) {
			// 경로 압축: x의 부모를 루트로 직접 연결
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}

	public void union(int a, int b) {
		int rootA = find(a);
		int rootB = find(b);

		if (rootA == rootB) {
			return;
		}

		// 랭크가 낮은 트리를 높은 트리에 연결
		if (rank[rootA] < rank[rootB]) {
			parent[rootA] = rootB;
		} else if (rank[rootA] > rank[rootB]) {
			parent[rootB] = rootA;
		} else {
			// 랭크가 같으면 한쪽을 연결하고 랭크를 1 증가
			parent[rootB] = rootA;
			rank[rootA]++;
		}
	}
}
