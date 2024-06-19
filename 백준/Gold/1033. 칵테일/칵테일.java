import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Node>[] A;
	static boolean[] visited;
	static long[] result;
	static long lcm;

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		A = new ArrayList[N];
		visited = new boolean[N];
		result = new long[N];
		lcm = 1;
		for (int i = 0; i < N; i++) {
			A[i] = new ArrayList<Node>();
		}

		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			A[a].add(new Node(b, p, q));
			A[b].add(new Node(a, q, p));
			lcm *= (p * q / gcd(p, q));
		}

		result[0] = lcm;
		DFS(0);
		long mgcd = result[0];
		for (int i = 0; i < N; i++) {
			mgcd = gcd(mgcd, result[i]);
		}
		for (int i = 0; i < N; i++) {
			bw.write(result[i] / mgcd + " ");
		}

		bw.flush();
		bw.close();

	}

	private static void DFS(int node) {
		visited[node] = true;
		for (Node i : A[node]) {
			int next = i.getB();
			if (!visited[next]) {
				result[next] = result[node] * i.getQ() / i.getP();
				DFS(next);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

	private static long gcd(long p, long q) {
		if (q == 0) {
			return p;
		} else {
			return gcd(q, p % q);
		}
	}

	private static class Node {
		int b, p, q;

		public Node(int b, int p, int q) {
			super();
			this.b = b;
			this.p = p;
			this.q = q;
		}

		public int getB() {
			return b;
		}

		public int getP() {
			return p;
		}

		public int getQ() {
			return q;
		}
	}
} // end