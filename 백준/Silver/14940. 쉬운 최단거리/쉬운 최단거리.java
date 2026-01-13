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
	static int[][] graph;
	static int[][] result;
	static int[][] dist;
	static int[][] DIRECTION = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 세로
			m = Integer.parseInt(st.nextToken()); // 가로

			graph = new int[n][m];
			result = new int[n][m];
			dist = new int[n][m];

			Point target = null;
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < m; j++) {
					int input = Integer.parseInt(st.nextToken());
					if (input == 2) {
						target = new Point(i, j);
					}
					graph[i][j] = input;
				}
			}

			bfs(target);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (graph[i][j] == 0) {
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

	private static void bfs(Point target) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dist[i][j] = -1;
			}
		}

		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(target.x, target.y));
		dist[target.x][target.y] = 0;

		while (!queue.isEmpty()) {
			Point curr = queue.poll();

			for (int[] position : DIRECTION) {
				int nx = position[0] + curr.x;
				int ny = position[1] + curr.y;

				if (nx >= 0 && nx < n && ny >= 0 && ny < m && dist[nx][ny] == -1 && graph[nx][ny] != 0) {
					dist[nx][ny] = dist[curr.x][curr.y] + 1;
					queue.offer(new Point(nx, ny));
				}
			}
		}
	}
}