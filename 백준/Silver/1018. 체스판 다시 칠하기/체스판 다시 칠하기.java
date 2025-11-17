import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] board = new char[N][M];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				board[i][j] = input.charAt(j);
			}
		}

		int minRepaint = Integer.MAX_VALUE;

		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				int w = calculate(board, i, j, 'W');
				int b = calculate(board, i, j, 'B');
				minRepaint = Math.min(minRepaint, Math.min(w, b));
			}
		}

		bw.write(minRepaint + "");

		br.close();
		bw.flush();
		bw.close();
	}

	private static int calculate(char[][] board, int row, int col, char startColor) {
		int count = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				char curr = board[i + row][j + col];
				if ((i + j) % 2 == 0) {
					if (curr != startColor) {
						count++;
					}
				} else {
					if (curr == startColor) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}