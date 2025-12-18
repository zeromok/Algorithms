import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(br.readLine());
			long[] dp = new long[1_000 + 1];
			bottomUp(dp);

			bw.write(dp[N] + "\n");

			bw.flush();
		}
	}

	private static void bottomUp(long[] dp) {
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= 1000; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 10_007;
		}
	}
}