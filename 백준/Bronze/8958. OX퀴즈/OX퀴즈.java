import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String testCase = br.readLine();
			int score = checker(testCase);
			bw.write(score + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static int checker(String testCase) {
		int result = 0;
		int count = 0;
		for (int i = 0; i < testCase.length(); i++) {
			if (testCase.charAt(i) == 'O') {
				count++;
				result += count;
			} else {
				count = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}