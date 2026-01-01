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
	static String[][] CAMPUS;
	static boolean[][] VISITED;
	static int COUNT;
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
			CAMPUS = new String[N][M];
			VISITED = new boolean[N][M];

			for (int i = 0; i < N; i++) {
				char[] charArray = br.readLine().toCharArray();
				for (int j = 0; j < M; j++) {
					CAMPUS[i][j] = String.valueOf(charArray[j]);
				}
			}

			int x = 0, y = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (CAMPUS[i][j].equals("I")) {
						x = i;
						y = j;
					}
				}
			}

			bfs(x, y);

			if (COUNT == 0)
				bw.write("TT");
			else
				bw.write(COUNT + "");
			bw.flush();
		}
	}

	private static void bfs(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		VISITED[x][y] = true;

		while (!queue.isEmpty()) {
			Point currPoint = queue.poll();

			int[] DX = {-1, 1, 0, 0};
			int[] DY = {0, 0, -1, 1};

			for (int i = 0; i < 4; i++) {
				int nx = currPoint.x + DX[i];
				int ny = currPoint.y + DY[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M && !CAMPUS[nx][ny].equals("X") && !VISITED[nx][ny]) {
					VISITED[nx][ny] = true;
					queue.offer(new Point(nx, ny));
					if (CAMPUS[nx][ny].equals("P")) {
						COUNT++;
					}
				}
			}
		}
	}
}
