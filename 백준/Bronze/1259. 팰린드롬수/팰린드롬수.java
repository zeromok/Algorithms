import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	private static String EOD = "0";

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String testCase = br.readLine();
			if (testCase.equals(EOD)) {
				break;
			}
			
			Deque<String> deque = new ArrayDeque<>();
			for (int i = 0; i < testCase.length(); i++) {
				deque.push(testCase.substring(i, i + 1));
			}
			String result = discriminator(deque);
			bw.write(result + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

	private static String discriminator(Deque<String> deque) {
		while (deque.size() > 1) {
			String first = deque.pollFirst();
			String last = deque.pollLast();
			if (!first.equals(last)) {
				return "no";
			}
		}
		return "yes";
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}