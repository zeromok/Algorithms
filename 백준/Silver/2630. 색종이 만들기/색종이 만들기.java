import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static final int WHITE = 0;
	static final int BLUE = 1;

	static int[][] paper;
	static int whiteCnt;
	static int blueCnt;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			paper = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					paper[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			recursion(0, 0, N);

			bw.write(whiteCnt + "\n" + blueCnt);
			bw.flush();
		}
	}

	private static void recursion(int x, int y, int size) {
		if (isSameColor(x, y, size)) {
			if (paper[x][y] == WHITE) {
				whiteCnt++;
			} else {
				blueCnt++;
			}
			return;
		}

		int nextSize = size / 2;
		recursion(x, y, nextSize);
		recursion(x, y + nextSize, nextSize);
		recursion(x + nextSize, y, nextSize);
		recursion(x + nextSize, y + nextSize, nextSize);

	}

	private static boolean isSameColor(int x, int y, int size) {
		int baseColor = paper[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (paper[i][j] != baseColor) {
					return false;
				}
			}
		}
		return true;
	}
}