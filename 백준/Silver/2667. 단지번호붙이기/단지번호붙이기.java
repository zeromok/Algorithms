import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int componentNum;
	static List<Integer> homeNum = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			visited = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				char[] line = br.readLine().toCharArray();
				for (int j = 0; j < N; j++) {
					map[i][j] = line[j] - 48;
				}
			}

			getComponentNum();
			bw.write(componentNum + "\n");
			homeNum.sort(Comparator.naturalOrder());
			for (Integer num : homeNum) {
				bw.write(num + "\n");
			}

			bw.flush();
		}
	}

	private static void getComponentNum() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					int bfs = bfs(i, j);
					homeNum.add(bfs);
					componentNum++;
				}
			}
		}
	}

	private static int bfs(int x, int y) {
		int count = 1;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x, y});
		visited[x][y] = true;

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = curr[0] + dx[i];
				int ny = curr[1] + dy[i];

				if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
					count++;
					queue.offer(new int[] {nx, ny});
					visited[nx][ny] = true;
				}
			}
		}
		return count;
	}
}