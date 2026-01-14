import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int r;
	static int c;
	static int count = 0;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			recursion(0, 0, (int)Math.pow(2, N));

			bw.write(count + "");
			bw.flush();
		}
	}

	private static void recursion(int startX, int startY, int size) {
		if (size == 1) {
			return;
		}

		int half = size / 2;

		if (r < startX + half && c < startY + half) {
			// 1사분면
			recursion(startX, startY, half);
		} else if (r < startX + half && c >= startY + half) {
			// 2사분면
			count += half * half;
			recursion(startX, startY + half, half);
		} else if (r >= startX + half && c < startY + half) {
			// 3사분면
			count += half * half * 2;
			recursion(startX + half, startY, half);
		} else {
			// 4사분면
			count += half * half * 3;
			recursion(startX + half, startY + half, half);
		}
	}
}