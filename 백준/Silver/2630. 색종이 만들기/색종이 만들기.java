import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
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

	private static void recursion(int x, int y, int n) {
		if (colorSameChk(x, y, n)) {
			if (paper[x][y] == 0) {
				whiteCnt++;
			} else {
				blueCnt++;
			}
		} else {
			int size = n / 2;
			recursion(x, y, size);
			recursion(x, y + size, size);
			recursion(x + size, y, size);
			recursion(x + size, y + size, size);
		}
	}

	private static boolean colorSameChk(int x, int y, int n) {
		int pivot = paper[x][y];
		for (int i = x; i < x + n; i++) {
			for (int j = y; j < y + n; j++) {
				if (pivot != paper[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}