import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] memo = new int[41][2];
	public static void main(String[] args) throws Exception {

		int T = Integer.parseInt(br.readLine());
		memo[0] = new int[]{1, 0};
		memo[1] = new int[]{0, 1};
		for (int i = 2; i <= 40; i++) {
			memo[i] = new int[] {-1, -1};
		}

		for (int i = 0; i < T; i++) {
			int[] fibonacci = fibonacci(Integer.parseInt(br.readLine()));
			bw.write(fibonacci[0] + " " + fibonacci[1] + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static int[] fibonacci(int i) {
		if (i <= 1) {
			return memo[i];
		}
		if (memo[i][0] != -1 || memo[i][1] != -1) {
			return memo[i];
		}

		int zero = fibonacci(i - 1)[0] + fibonacci(i - 2)[0];
		int one = fibonacci(i - 1)[1] + fibonacci(i - 2)[1];
		int[] set = {zero, one};
		memo[i] = set;
		return set;
	}
}