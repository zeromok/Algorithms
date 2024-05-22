package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[] A = new int[N - M + 1];
		for (int i = 0; i < A.length; i++) {
			A[i] = M + i;
		}

		for (int i = 2; i <= Math.sqrt(N); i++) {
			int start = Math.max(i * i, (M + i - 1) / i * i);
			for (int k = start; k <= N; k += i) {
				if (k >= M) {
					A[k - M] = 0;
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0 && A[i] >= 2) {
				System.out.println(A[i]);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end
