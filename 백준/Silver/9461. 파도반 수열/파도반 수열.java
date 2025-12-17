import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());
			long[] dp = new long[100 + 1];
			bottomUp(dp);

			while (T-- > 0) {
				int N = Integer.parseInt(br.readLine());
				bw.write(dp[N] + "\n");
			}

			bw.flush();
		}
	}

	private static void bottomUp(long[] dp) {
		dp[1] = dp[2] = dp[3] = 1;
		for (int i = 4; i <= 100; i++) {
			dp[i] = dp[i - 2] + dp[i - 3];
		}
	}
}