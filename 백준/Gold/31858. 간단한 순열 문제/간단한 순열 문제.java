import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] P = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}

		long count = 0;

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && P[stack.peek()] < P[i]) {
				int idx = stack.pop();
				count++;
			}
			stack.push(i);
		}

		stack.clear();

		for (int i = N - 1; i >= 0; i--) {
			while (!stack.isEmpty() && P[stack.peek()] < P[i]) {
				int idx = stack.pop();
				count++;
			}
			stack.push(i);
		}

		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		solution();
	}
}