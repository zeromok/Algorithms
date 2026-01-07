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
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[100_001];
		int[] time = new int[100_001];

		queue.offer(n);
		visited[n] = true;
		time[n] = 0;

		while (!queue.isEmpty()) {
			int current = queue.poll();
			if (current == k) {
				return time[current];
			}

			int[] nextPositions = {current - 1, current + 1, current * 2};
			for (int next : nextPositions) {
				if (next >= 0 && next <= 100000 && !visited[next]) {
					visited[next] = true;
					time[next] = time[current] + 1;
					queue.offer(next);
				}
			}
		}
		return -1;
	}
}