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
		int result = 0;

		for (int i = N - 54; i < N; i++) {
			int decompositionSum = i + getDigitSum(i);
			if (N == decompositionSum) {
				result = i;
				break;
			}
		}
		bw.write(result + "");

		br.close();
		bw.flush();
		bw.close();
	}

	private static int getDigitSum(int number) {
		int sum = 0;
		int temp = number;
		while (temp > 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}