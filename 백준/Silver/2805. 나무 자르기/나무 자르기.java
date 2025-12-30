import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			long M = Integer.parseInt(st.nextToken());

			long[] trees = new long[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				trees[i] = Integer.parseInt(st.nextToken());
			}

			long left = 0;
			long right = Arrays.stream(trees).max().getAsLong();
			long answer = 0;
			while (left <= right) {
				long mid = left + (right - left) / 2;
				if (canMake(trees, mid, M)) {
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

	private static boolean canMake(long[] trees, long mid, long m) {
		long sum = 0;
		for (long tree : trees) {
			if (tree > mid) {
				sum += tree - mid;
			}
		}
		return sum >= m;
	}
}