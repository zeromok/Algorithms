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

		int[] A = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			A[i] = i;
		}

		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (A[i] == 0)
				continue;
			for (int k = i + i; k <= N; k = k + i) {
				A[k] = 0;
			}
		}

		for (int i = M; i <= N; i++) {
			if (A[i] != 0) {
				System.out.println(A[i]);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end