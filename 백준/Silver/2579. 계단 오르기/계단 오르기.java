import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int[] score;
	static int[][] dp;

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int stairsNum = Integer.parseInt(br.readLine());

			score = new int[stairsNum + 1];
			for (int i = 1; i <= stairsNum; i++) {
				score[i] = Integer.parseInt(br.readLine());
			}

			dp = new int[stairsNum + 1][2];
			bw.write(bottomUp(stairsNum) + "");

			bw.flush();
		}
	}

	private static int bottomUp(int n) {

		if (n == 1) {
			return score[1];
		}

		if (n == 2) {
			return Math.max(score[1] + score[2], score[2]);
		}

		dp[1][0] = score[1];
		dp[2][0] = score[1] + score[2];
		dp[2][1] = score[2];
		for (int i = 3; i <= n; i++) {
			dp[i][0] = dp[i - 1][1] + score[i];
			dp[i][1] = Math.max(dp[i - 2][0], dp[i - 2][1]) + score[i];
		}

		return Math.max(dp[n][0], dp[n][1]);
	}
}