import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int[] cables = new int[K];
			for (int i = 0; i < K; i++) {
				cables[i] = Integer.parseInt(br.readLine());
			}

			long left = 1;
			long right = Integer.MAX_VALUE;
			long answer = 0;
			while (left <= right) {
				long mid = (left + right) / 2;
				if (canMake(cables, mid, N)) {
					answer = mid;
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			bw.write(answer + "");
			bw.flush();
		}
	}

	private static boolean canMake(int[] cables, long length, int N) {
		long total = 0;
		for (int cable : cables) {
			total += cable / length;
		}
		return total >= N;
	}
}