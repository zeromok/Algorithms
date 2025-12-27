import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] field;
	static int M;
	static int N;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());
			while (T-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				M = Integer.parseInt(st.nextToken());
				N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				field = new int[M][N];
				visited = new boolean[M][N];
				for (int i = 0; i < K; i++) {
					st = new StringTokenizer(br.readLine());
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					field[x][y] = 1;
				}
				int count = 0;
				for (int i = 0; i < M; i++) {
					for (int j = 0; j < N; j++) {
						if (field[i][j] == 1 && !visited[i][j]) {
							bfs(i, j);
							count++;
						}
					}
				}
				bw.write(count + "\n");
			}

			bw.flush();
		}
	}

	private static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		visited[x][y] = true;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		while (!queue.isEmpty()) {
			int[] v = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = v[0] + dx[i];
				int ny= v[1] + dy[i];
				if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && field[nx][ny] == 1) {
					queue.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
				}
			}
		}
	}
}