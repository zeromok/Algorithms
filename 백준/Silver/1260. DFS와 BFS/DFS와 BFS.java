import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점
		int M = Integer.parseInt(st.nextToken()); // 간선
		int V = Integer.parseInt(st.nextToken()); // 시작노드
		
		// 인접리스트 선언 및 초기화
		A = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<>();
		}
		
		for (int j = 1; j <= M; j++) {
			st = new StringTokenizer(br.readLine());
			int data1 = Integer.parseInt(st.nextToken());
			int data2 = Integer.parseInt(st.nextToken());
			
			A[data1].add(data2);
			A[data2].add(data1);
		}
		
		// 작은 것을 먼저 방문하기 위한 정렬 수행
		for (int k = 1; k <= N; k++) {
			Collections.sort(A[k]);
		}
		
		// 방문배열 선언 및 초기화
		visited = new boolean[N + 1];
		DFS(V);
		
		bw.write("\n");
		
		visited = new boolean[N + 1];
		BFS(V);
		
		bw.flush();
		bw.close();
	}
	
	// 깊이 우선 탐색 -> 재귀를 사용해 구현
	private static void DFS(int root) throws IOException {
		if (visited[root])
			return;
		
		visited[root] = true;
		bw.write(root + " ");
		
		for (int i : A[root]) {
			if (!visited[i]) {
				DFS(i);
			}
		}
	}
	
	// 너비 우선 탐색 -> 큐를 사용해 구현
	private static void BFS(int root) throws IOException {
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[root] = true;
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			int node = queue.poll();
			bw.write(node + " ");
			
			for (int i : A[node]) {
				if (!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
			
		}
	}
}