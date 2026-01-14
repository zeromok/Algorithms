import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int m;
	static int[][] map;
	static int[][] dist;
	final static int TARGET_VALUE = 2;
	final static int WALL = 0;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			map = new int[n][m];
			dist = new int[n][m];

			int[] target = new int[2];
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					int value = Integer.parseInt(st.nextToken());
					map[i][j] = value;
					dist[i][j] = -1;

					if (map[i][j] == TARGET_VALUE) {
						target = new int[] {i, j};
					} else if (map[i][j] == WALL) {
						dist[i][j] = 0;
					}
				}
			}

			bfs(target);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (map[i][j] == 0) {
						bw.write("0 ");
					} else {
						bw.write(dist[i][j] + " ");
					}
				}
				bw.newLine();
			}

			bw.flush();
		}
	}

	private static void bfs(int[] target) {
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(target);
		dist[target[0]][target[1]] = 0;

		int[][] positions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();

			for (int[] position : positions) {
				int nx = curr[0] + position[0];
				int ny = curr[1] + position[1];

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] != 0 && dist[nx][ny] == -1) {
					queue.offer(new int[] {nx, ny});
					dist[nx][ny] = dist[curr[0]][curr[1]] + 1;
				}
			}
		}
	}
}