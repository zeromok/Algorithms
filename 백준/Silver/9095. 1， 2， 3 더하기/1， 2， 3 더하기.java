import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] dp;
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int T = Integer.parseInt(br.readLine());
			dp = new int[11 + 1];
			dp[1] = 1;
			dp[2] = 2;
			dp[3] = 4;
			for (int j = 4; j <= 11; j++) {
				dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
			}

			for (int i = 0; i < T; i++) {
				int n = Integer.parseInt(br.readLine());
				bw.write(dp[n] + "\n");
			}

			bw.flush();
		}
	}
}