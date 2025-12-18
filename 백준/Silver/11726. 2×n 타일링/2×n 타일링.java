import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] memo;
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			memo = new int[1_000 + 1];
			memo[1] = 1;
			memo[2] = 2;
			int N = Integer.parseInt(br.readLine());

			bw.write(topDown(N) + "");

			bw.flush();
		}
	}

	private static int topDown(int n) {
		if (n == 1) {
			return 1;
		}

		if (memo[n] != 0) {
			return memo[n];
		}

		memo[n] = (topDown(n - 1) + topDown(n - 2)) % 10_007;
		return memo[n];
	}
}