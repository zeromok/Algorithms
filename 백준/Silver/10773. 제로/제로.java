import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < K; i++) {
			int number = Integer.parseInt(br.readLine());
			if (number == 0) {
				stack.pop();
			} else {
				stack.push(number);
			}
		}

		long result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

}