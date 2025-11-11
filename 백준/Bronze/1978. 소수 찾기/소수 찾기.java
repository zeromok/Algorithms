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

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;

		for (int i = 0; i < N; i++) {
			int number = Integer.parseInt(st.nextToken());
			if (isPrime(number)) {
				count++;
			}
		}

		bw.write(count + "");

		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean isPrime(int input) {
		if (input < 2) {
			return false;
		}
		int limit = (int)Math.sqrt(input);
		for (int i = 2; i <= limit; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}