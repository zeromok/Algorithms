import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		int ones = 0, zeros = 0;
		int result = 0;

		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				zeros++;
			} else if (temp == 1) {
				ones++;
			} else if (temp < 0) {
				minus.add(temp);
			} else {
				plus.add(temp);
			}
		}

		while (plus.size() > 1) {
			int first = plus.remove();
			int second = plus.remove();
			result += first * second;
		}
		if (!plus.isEmpty()) {
			result += plus.remove();
		}

		while (minus.size() > 1) {
			int first = minus.remove();
			int second = minus.remove();
			result += first * second;
		}
		if (!minus.isEmpty()) {
			if (zeros == 0) {
				result += minus.remove();
			}
		}

		result += ones;

		bw.write(result + "\n");

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}