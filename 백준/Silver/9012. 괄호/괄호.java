import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCaseCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCaseCount; i++) {
			char[] testCase = br.readLine().toCharArray();
			bw.write(checker(testCase) + "\n");
		}

		bw.flush();
		bw.close();
	}

	private static String checker(char[] charArray) {
		int balance = 0;

		for (char c : charArray) {
			balance += (c == '(') ? 1 : -1;

			if (balance < 0) {
				return "NO";
			}
		}

		return balance == 0 ? "YES" : "NO";
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

} // end