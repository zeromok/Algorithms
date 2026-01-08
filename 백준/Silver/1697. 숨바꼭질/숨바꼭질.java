import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			bw.write(bfs(N, K) + "");

			bw.flush();
		}
	}

	private static int bfs(int n, int k) {
		boolean[] visited = new boolean[100_001];
		int[] time = new int[100_001];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(n);
		time[n] = 0;
		visited[n] = true;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (curr == k) {
				return time[curr];
			}

			int[] nextPositions = {curr - 1, curr + 1, curr * 2};
			for (int next : nextPositions) {
				if (next >= 0 && next <= 100000 && !visited[next]) {
					visited[next] = true;
					time[next] = time[curr] + 1;
					queue.offer(next);
				}
			}
		}
		return -1;
	}
}