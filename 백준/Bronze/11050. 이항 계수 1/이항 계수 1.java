import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		bw.write(factorial(N) / (factorial(N - K) * factorial(K)) + "");

		br.close();
		bw.flush();
		bw.close();
	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}