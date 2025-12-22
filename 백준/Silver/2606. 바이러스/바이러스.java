import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static List<List<Integer>> graph = new ArrayList<>();
	static boolean[] visited;
	static int count;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int vertices = Integer.parseInt(br.readLine());
			visited = new boolean[vertices + 1];

			for (int i = 0; i < vertices + 1; i++) {
				graph.add(new ArrayList<>());
			}

			int edgeNum = Integer.parseInt(br.readLine());

			for (int i = 0; i < edgeNum; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph.get(x).add(y);
				graph.get(y).add(x);
			}

			dfs(1);
			bw.write(count - 1 + "");

			bw.flush();
		}
	}

	private static void dfs(int start) {
		visited[start] = true;
		count++;

		for (int e : graph.get(start)) {
			if (!visited[e]) {
				dfs(e);
			}
		}
	}
}