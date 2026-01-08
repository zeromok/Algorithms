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
	static int M;
	static List<List<Integer>> graph;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); // 유저 수
			graph = new ArrayList<>();
			for (int i = 0; i <= N; i++) {
				graph.add(i, new ArrayList<>());
			}

			M = Integer.parseInt(st.nextToken()); // 관계 수
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph.get(x).add(y);
				graph.get(y).add(x);
			}

			int minValue = Integer.MAX_VALUE;
			int idx = N;
			for (int i = 1; i <= N; i++) {
				int sum = getCavinBaconSum(i);
				if (minValue > sum || (minValue == sum && idx > i)) {
					idx = i;
					minValue = sum;
				}
			}

			bw.write(idx + "");

			bw.flush();
		}
	}

	private static int getCavinBaconSum(int start) {
		int[] distance = new int[N + 1];
		Arrays.fill(distance, -1);

		Queue<Integer> queue = new LinkedList<>();
		distance[start] = 0;
		queue.offer(start);

		while (!queue.isEmpty()) {
			int curr = queue.poll();

			for (Integer i : graph.get(curr)) {
				if (distance[i] == -1) {
					distance[i] = distance[curr] + 1;
					queue.offer(i);
				}
			}
		}

		return distanceSum(distance);
	}

	private static int distanceSum(int[] distance) {
		int sum = 0;
		for (int i : distance) {
			sum += i;
		}

		return sum + 1;
	}
}