import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static boolean isArrive;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		
		A = new ArrayList[node];
		visited = new boolean[node];
		isArrive = false;
		
		for (int i = 0; i < node; i++) {
			A[i] = new ArrayList<Integer>();
		}
		
		for (int j = 0; j < edge; j++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			A[N].add(M);
			A[M].add(N);
		}
		
		for (int i = 0; i < node; i++) {
			DFS(i, 1);
			if (isArrive)
				break;
		}
		
		if (isArrive) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		bw.flush();
		bw.close();
	}
	
	private static void DFS(int num, int depth) {
		if (depth == 5 || isArrive) {
			isArrive = true;
			return;
		}
		
		visited[num] = true;
		for (int item : A[num]) {
			if (!visited[item]) {
				DFS(item, depth + 1);
			}
		}
		visited[num] = false; // 만족하지 못하면 빠져나오면서 초기화 시켜줘야한다.
	}
}