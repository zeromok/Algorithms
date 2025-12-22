import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[][] field;
	static boolean[][] visited;
	static int N;
	static int M;
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
							dfs(i, j);
							count++;
						}
					}
				}
				bw.write(count + "\n");
			}

			bw.flush();
		}
	}

	private static void dfs(int x, int y) {
		visited[x][y] = true;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		for (int i = 0; i < 4; i++) {
			int new_x = x + dx[i];
			int new_y = y + dy[i];

			if (0 <= new_x && new_x < M && 0 <= new_y && new_y < N && !visited[new_x][new_y] && field[new_x][new_y] == 1) {
				dfs(new_x, new_y);
			}
		}
	}
}
