import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static List<List<Integer>> graph;
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			graph = new ArrayList<>();
			for (int i = 0; i <= N; i++) {
				graph.add(new ArrayList<>());
			}

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph.get(x).add(y);
				graph.get(y).add(x);
			}

			int minDistances = Integer.MAX_VALUE;
			int minIdx = 0;
			for (int i = 1; i <= N; i++) {
				int kevinBaconNum = calculateKevinBaconNum(i);
				if (kevinBaconNum < minDistances) {
					minDistances = kevinBaconNum;
					minIdx = i;
				}
			}
			bw.write(minIdx + "");

			bw.flush();
		}
	}

	static int calculateKevinBaconNum(int start) {
		int[] distances = new int[N + 1];
		Arrays.fill(distances, -1);

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		distances[start] = 0;

		while (!queue.isEmpty()) {
			int v = queue.poll();

			for (int neighbor : graph.get(v)) {
				if (distances[neighbor] == -1) {
					distances[neighbor] = distances[v] + 1;
					queue.offer(neighbor);
				}
			}
		}
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += distances[i];
		}

		return sum;
	}
}