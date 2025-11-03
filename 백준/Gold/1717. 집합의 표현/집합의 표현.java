import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[] parent;
	static int[] rank;

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n, m;
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		parent = new int[n + 1];
		rank = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int operation = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (operation == 0) {
				union(a, b);
			} else if (operation == 1) {
				int rootA = find(a);
				int rootB = find(b);
				if (rootA == rootB) {
					bw.write("YES\n");
				} else {
					bw.write("NO\n");
				}
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}

	public static int find(int x) {
		if (parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}

	public static void union(int a, int b) {
		int rootA = find(a);
		int rootB = find(b);

		if (rootA == rootB) {
			return;
		}

		if (rank[rootA] < rank[rootB]) {
			parent[rootA] = rootB;
		} else if (rank[rootA] > rank[rootB]) {
			parent[rootB] = rootA;
		} else {
			parent[rootB] = rootA;
			rank[rootA]++;
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end