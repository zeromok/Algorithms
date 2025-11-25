import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 1; i <= N; i++) {
			deque.offer(i);
		}

		int K = Integer.parseInt(st.nextToken());
		bw.write("<");
		while (!deque.isEmpty()) {
			for (int i = 1; i < K; i++) {
				Integer element = deque.poll();
				deque.offer(element);
			}
			bw.write(deque.size() != 1 ? deque.poll() + ", " : deque.poll() + "");
		}
		bw.write(">");

		br.close();
		bw.flush();
		bw.close();
	}
}