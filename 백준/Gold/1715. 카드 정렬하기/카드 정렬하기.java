import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.parseLong(br.readLine());

		PriorityQueue<Integer> cardSize = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			cardSize.add(Integer.valueOf(br.readLine()));
		}

		long result = 0;
		while (cardSize.size() != 1) {
			int first = cardSize.remove();
			int second = cardSize.remove();

			result += first + second;
			cardSize.add(first + second);
		}

		bw.write(result + "\n");

		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		solution();
	}

}
