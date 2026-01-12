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

			int result = bfs(N, K);
			bw.write(result + "");

			bw.flush();
		}
	}

	private static int bfs(int n, int k) {
		Queue<Integer> queue = new LinkedList<>();
		int[] time = new int[100_001];
		boolean[] visited = new boolean[100_001];

		queue.offer(n);
		time[n] = 0;
		visited[n] = true;

		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (curr == k) {
				return time[curr];
			}

			int[] nextPosition = {curr - 1, curr + 1, 2 * curr};
			for (int next : nextPosition) {
				if (next >= 0 && next <= 100_000 && !visited[next]) {
					queue.offer(next);
					visited[next] = true;
					time[next] = time[curr] + 1;
				}
			}
		}
		return -1;
	}
}