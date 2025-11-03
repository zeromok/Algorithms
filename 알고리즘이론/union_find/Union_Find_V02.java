package 알고리즘이론.union_find;

public class Union_Find_V02 {
	// find(): 재귀를 사용하는 기본 연산
	// union(): 기본 연산

	private final int[] parent;

	public Union_Find_V02(int n) {
		this.parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	// 재귀적으로 호출된다 -> 중첩 호출 된다. -> 깊이가 깊어지면 StackOverflowError 발생 가능성 있음
	public int find(int x) {
		// 1. 루트 노드를 찾으면 반환 (재귀 종료 조건)
		if (parent[x] == x) {
			return x;
		}

		// 2. 경로 압축 없이 부모의 find 결과만 반환
		// (parent[x]를 갱신하지 않음)
		return find(parent[x]);
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
