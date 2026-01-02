import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int COUNT;
	static char[][] CAMPUS;
	static boolean[][] VISITED;
	static final int[] DX = {-1, 1, 0, 0};
	static final int[] DY = {0, 0, -1, 1};

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
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			CAMPUS = new char[N][M];
			VISITED = new boolean[N][M];

			int startX = 0, startY = 0;
			for (int i = 0; i < N; i++) {
				char[] oneLine = br.readLine().toCharArray();
				for (int j = 0; j < M; j++) {
					if (oneLine[j] == 'I') {
						startX = i;
						startY = j;
					}
					CAMPUS[i][j] = oneLine[j];
				}
			}

			bfs(startX, startY);

			if (COUNT == 0) {
				bw.write("TT");
			} else {
				bw.write(COUNT + "");
			}
			bw.flush();
		}
	}

	private static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		VISITED[x][y] = true;

		while (!queue.isEmpty()) {
			Point curr = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = curr.x + DX[i];
				int ny = curr.y + DY[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M && !VISITED[nx][ny] && CAMPUS[nx][ny] != 'X') {
					queue.offer(new Point(nx, ny));
					VISITED[nx][ny] = true;
					if (CAMPUS[nx][ny] == 'P') {
						COUNT++;
					}
				}
			}
		}
	}
}