import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private static final String EOD = "0";

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String testCase = br.readLine();
			if (testCase.equals(EOD)) {
				break;
			}
			
			bw.write(isPalindrome(testCase) ? "yes\n" : "no\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static boolean isPalindrome(String testCase) {
		int first = 0;
		int last = testCase.length() - 1;
		while (first < last) {
			if (testCase.charAt(first) != testCase.charAt(last)) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}