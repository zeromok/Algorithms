package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());

		long start = 1;
		long end = (long)N * N;
		long result = 0;

		while (start <= end) {
			long mid = (start + end) / 2;
			long cnt = 0;

			for (int i = 1; i <= N; i++) {
				cnt += Math.min(mid / i, N);
			}
			if (cnt < K) {
				start = mid + 1;
			} else {
				result = mid;
				end = mid - 1;
			}
		}

		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

} // end
