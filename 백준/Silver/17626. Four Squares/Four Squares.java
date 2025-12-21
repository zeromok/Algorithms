import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static long[] dp;
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());

			bw.write(bottomUp(N) + "");

			bw.flush();
		}
	}

	private static long bottomUp(int n) {
		dp = new long[n + 1];
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
			}
		}
		return dp[n];
	}
}