import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	private static int M, N;
	private static int[][] box;
	private static int unripeCount = 0;
	private static int days = 0;

	private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			box = new int[N][M];

			Queue<int[]> queue = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					box[i][j] = Integer.parseInt(st.nextToken());
					if (box[i][j] == 1) {
						queue.offer(new int[] {i, j});
					} else if (box[i][j] == 0) {
						unripeCount++;
					}
				}
			}

			if (unripeCount == 0) {
				bw.write(0 + "");
				bw.flush();
				return;
			}

			bfs(queue);

			int result = unripeCount == 0 ? days : -1;
			bw.write(result + "");
			bw.flush();
		}
	}

	private static void bfs(Queue<int[]> queue) {
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();

			days = box[curr[0]][curr[1]] - 1;

			for (int[] direction : DIRECTIONS) {
				int nx = direction[0] + curr[0];
				int ny = direction[1] + curr[1];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M && box[nx][ny] == 0) {
					queue.offer(new int[] {nx, ny});
					box[nx][ny] = box[curr[0]][curr[1]] + 1;
					unripeCount--;
				}
			}
		}
	}
}