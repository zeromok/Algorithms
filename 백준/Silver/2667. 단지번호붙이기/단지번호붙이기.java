import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static int N;
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			visited = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				char[] line = br.readLine().toCharArray();
				for (int j = 0; j < N; j++) {
					int value = line[j] - '0';
					map[i][j] = value;
				}
			}

			List<Integer> sortedCity = findCity();

			bw.write(sortedCity.size() + "\n");
			for (Integer city : sortedCity) {
				bw.write(city + "\n");
			}
			bw.flush();
		}
	}

	private static List<Integer> findCity() {
		List<Integer> sizes = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					int size = DFS(i, j);
					sizes.add(size);
				}
			}
		}

		Collections.sort(sizes);
		return sizes;
	}

	private static int DFS(int x, int y) {
		visited[x][y] = true;
		int count = 1;

		for (int[] dir : DIRECTIONS) {
			int nx = x + dir[0];
			int ny = y + dir[1];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && map[nx][ny] == 1) {
				count += DFS(nx, ny);
			}
		}
		return count;
	}
}