import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static final String EOD = "0";

	public static void main(String[] args) throws Exception {
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

	private static boolean isPalindrome(String t) {
		int original = Integer.parseInt(t);
		int reversed = 0;
		int temp = original;
		while (temp > 0) {
			reversed = reversed * 10 + temp % 10;
			temp /= 10;
		}
		return original == reversed;
	}
}