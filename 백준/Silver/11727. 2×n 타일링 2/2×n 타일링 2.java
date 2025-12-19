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
			bottomUp();

			bw.write(dp[N] + "");
			bw.flush();
		}
	}

	private static void bottomUp() {
		dp = new long[1_000 + 1];
		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i <= 1_000; i++) {
			dp[i] = (dp[i - 2] * 2 + dp[i - 1]) % 10_007;
		}
	}
}