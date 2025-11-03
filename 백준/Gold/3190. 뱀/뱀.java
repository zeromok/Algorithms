import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	static class Coordinate {
		int r, c;
		public Coordinate(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N + 1][N + 1];

		int K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			board[r][c] = 1;
		}

		int L = Integer.parseInt(br.readLine());
		Map<Integer, String> directionMap = new HashMap<>();
		for (int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			String C = st.nextToken();
			directionMap.put(X, C);
		}

		Deque<Coordinate> snake = new ArrayDeque<>();

		snake.addFirst(new Coordinate(1, 1));
		board[1][1] = 2;

		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};

		int currDirectionIdx = 0;
		int time = 0;

		while (true) {
			time++;
			Coordinate currHead = snake.peekFirst();
			int nr = currHead.r + dr[currDirectionIdx];
			int nc = currHead.c + dc[currDirectionIdx];

			if (nr < 1 || nr > N || nc < 1 || nc > N) {
				break;
			}

			if (board[nr][nc] == 2) {
				break;
			}

			boolean isApple = (board[nr][nc] == 1);
			if (!isApple) {
				Coordinate tail = snake.pollLast();
				board[tail.r][tail.c] = 0;
			}

			snake.addFirst(new Coordinate(nr, nc));
			board[nr][nc] = 2;

			if (directionMap.containsKey(time)) {
				String s = directionMap.get(time);
				if (s.equals("D")) {
					currDirectionIdx = (currDirectionIdx + 1) % 4;
				} else if (s.equals("L")) {
					currDirectionIdx = (currDirectionIdx + 3) % 4;
				}
			}
		}
		System.out.println(time);
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}