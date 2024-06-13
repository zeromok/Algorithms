import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long n = Long.parseLong(br.readLine());
		long result = n;

		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				result = result - (result / i);
				while (n % i == 0) {
					n /= i;
				}
			}
		}

		if (n > 1) {
			result = result - (result / n);
		}

		bw.write(result + "");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end