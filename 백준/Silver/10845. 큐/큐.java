import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> queue = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			switch (command) {
				case "push":
					int X = Integer.parseInt(st.nextToken());
					queue.addLast(X);
					break;
				case "pop":
					sb.append(queue.isEmpty() ? "-1" + "\n" : queue.pollFirst() + "\n");
					break;
				case "size":
					sb.append(queue.size() + "\n");
					break;
				case "empty":
					sb.append(queue.isEmpty() ? "1" + "\n" : "0" + "\n");
					break;
				case "front":
					sb.append(queue.isEmpty() ? "-1" + "\n" : queue.getFirst() + "\n");
					break;
				case "back":
					sb.append(queue.isEmpty() ? "-1" + "\n" : queue.getLast() + "\n");
					break;
			}
		}

		System.out.println(sb);
		br.close();
	}

	public static void main(String[] args) throws Exception {
		solution();
	}

}